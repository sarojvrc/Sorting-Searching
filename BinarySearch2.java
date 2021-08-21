package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
	
	//function for binarySearch
	static void binarySearch(int arr[], int element) {
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		int count = 0;
		
		while(low<high) {
			if(element == arr[mid]) {
				System.out.println("Element is found at "+mid+"th position");
				count++;
				break;
			}else if(element < arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
			mid = (low+high)/2;
		}
		if(count == 0) {
			System.out.println("Element not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		//In binary array should be ascending order
		// [ 3,6, 8,12,23,45,56,85,74,96,102 ]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements in a sorted format");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		
		//call the method to search
		binarySearch(arr, element);
	}

}
