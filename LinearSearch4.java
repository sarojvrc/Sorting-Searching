package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch4 {
	//function for linearSearch
		static boolean linearSearch(int arr[], int target) {
			//now lets check if the size of the array is 0, then it will return -1
			if(arr.length == 0) {
				return false;
			}
			//run a for loop for search
			for(int i=0; i<arr.length; i++) { //here i means index value of the array
				int element = arr[i]; 
				if(element == target) {
					return true;
					//if we found the target element from the array then it will return true
				}
			} //for loop ends here
			
			//if we won't found the target element then return false
			return false;
			
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
			boolean result = linearSearch(arr, target);
			System.out.println(result);
			//if true then element is found, if false then element is not found
		}

}
