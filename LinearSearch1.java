package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1 {
	
	//function for linearSearch
	static int linearSearch(int arr[], int target) {
		//now lets check if the size of the array is 0, then it will return -1
		if(arr.length == 0) {
			return -1;
		}
		//run a for loop for search
		for(int i=0; i<arr.length; i++) { //here i means index value of the array
			int element = arr[i]; 
			if(element == target) {
				return i;
				//if we found the target element from the array then it will return the index number
				//of this element
			}
		} //for loop ends here
		
		//if we won't found the target element then return -1
		return -1;
		
	}
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		//lets get the target number from the user
		System.out.println("Enter the target search number");
		int target = sc.nextInt();
		//now lets call the linear search function to find the search result
		int result = linearSearch(arr, target);
		System.out.println("The index number of "+target+" is "+result);
		//if it return -1, then target element is not found. 
	}

}
