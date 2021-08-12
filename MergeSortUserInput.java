package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortUserInput {
	
	//function for MergeSort
	static void MergeSort(int arr[], int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			MergeSort(arr, left, mid);
			MergeSort(arr, mid+1, right);
			Merge(arr, left, mid, right);
		}
	}
	
	//function for Merge
	static void Merge(int arr[], int left, int mid, int right) {
		int temparr[] = new int[arr.length];
		int i = left;
		int j = mid +1;
		int k=left;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temparr[k] = arr[i];
				i++;
			}else {
				temparr[k] = arr[j];
				j++;
			}
			k++;
		} //while loop ends here
		if(i>mid) {
			while(j<=right) {
				temparr[k] = arr[j];
				k++;
				j++;
			}
		}else {
			while(i<=mid) {
				temparr[k] = arr[i];
				k++;
				i++;
			}
		} //if else ends here
		
		//now lets copy the array elements from temparr to arr
		for(k=left; k<=right; k++) {
			arr[k] = temparr[k];
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sort "+Arrays.toString(arr));
		int left = 0;
		int right = arr.length-1;
		//let call the sort method
		MergeSortUserInput obj = new MergeSortUserInput();
		obj.MergeSort(arr, left, right);
		System.out.println("After merge sort "+Arrays.toString(arr));
	}

}
