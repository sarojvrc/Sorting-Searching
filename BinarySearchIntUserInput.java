package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIntUserInput {
	
	//function for BinarySearch
	static void BinarySearch(int arr[], int low, int high, int element) {
		int count = 0;
		int mid = (low+high)/2;
		while(low <= high) {
			if(arr[mid] == element) {
				System.out.println("Element "+element+" is found at "+mid+"th postion");
				count++;
				break;
			}else if(arr[mid] < element) {
				low = mid +1;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
			
		}
		if(count == 0) {
			System.out.println("Item not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		int low = 0;
		int high = arr.length-1;
		
		System.out.println("Enter the element to find ");
		int element = sc.nextInt();
		
		//call the method for search
		BinarySearchIntUserInput.BinarySearch(arr,low,high,element);
	}

}
