package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting "+Arrays.toString(arr));
		//sorting using bubble sort
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorted ");
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
