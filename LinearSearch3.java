package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch3 {
	
	//function for linearSearch
		static String linearSearch(int arr[], int target) {
			//now lets check if the size of the array is 0, then it will return -1
			if(arr.length == 0) {
				return "Array size is 0.";
			}
			//run a for loop for search
			for(int i=0; i<arr.length; i++) { //here i means index value of the array
				int element = arr[i]; 
				if(element == target) {
					return "Element is found";
					//if we found the target element from the array then it will return a message
				}
			} //for loop ends here
			
			//if we won't found the target element then return the message
			return "Element not found";
			
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
			String result = linearSearch(arr, target);
			System.out.println(result);
			//if the element found, it will return a message 
		}

}
