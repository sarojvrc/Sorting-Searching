package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortUserInput {
	
	//method for InsertionSort
	static void InsertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
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
		System.out.println("Array before sort "+Arrays.toString(arr));

		//call the method to sort
		InsertionSortUserInput.InsertionSort(arr);
		System.out.println("Array after sort "+Arrays.toString(arr));
	}

}
