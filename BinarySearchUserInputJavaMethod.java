package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUserInputJavaMethod {
	
	//function for BinarySearch
	static void BinarySearch(int arr[], int element) {
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		int count = 0;
		while(low<=high) {
			if(arr[mid] == element) {
				System.out.println(element+" is found at "+mid+"th positon");
				count++;
				break;
			}else if(arr[mid]<element) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
		}
		if(count == 0) {
			System.out.println("Element not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements in a sorted format ");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		//now let's take input for search elements
		System.out.println("Enter the element for searching");
		int element = sc.nextInt();
		//call the method to search
		BinarySearchUserInputJavaMethod.BinarySearch(arr, element);
	}

}
