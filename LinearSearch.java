package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	//function for linearsearch
	static void linearsearch(int arr[], int item) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == item) {
				System.out.println("The item "+item+" is found at "+i+"th position");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Item not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		System.out.println("Enter the item to search");
		int item = sc.nextInt();
		//call the linear method to search
		linearsearch(arr, item);
	}

}
