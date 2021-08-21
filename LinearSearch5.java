package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch5 {
	
	//method for linearsearch
	static void linearsearch(int arr[], int element) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(element == arr[i]) {
				System.out.println("The element is found at "+i+"th positon");
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Element not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		
		// 4, 7, 1 , 56, 32, 45, 2, 3, 5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is "+Arrays.toString(arr));
		
		System.out.println("Enter the element you want to search");
		int element = sc.nextInt();
		
		//call the search function
		linearsearch(arr, element);
		
	}

}
