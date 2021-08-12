package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortJavaMethod {
	
	//method
	static void SelectionSort(int arr[]) {
		int size = arr.length;
		for(int i=0; i<size-1; i++){
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			} //inner loop
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sort "+Arrays.toString(arr));
		
		//now we will call the method
		SelectionSortJavaMethod.SelectionSort(arr);
		System.out.println("After sorted "+Arrays.toString(arr));
		
	}

}
