package dsa;

import java.util.Arrays;

public class IntegerLinearSearch {
	
	//function for LinearSearch
	static void LinearSearch(int arr[], int item) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			if(item == arr[i]) {
				System.out.println("Item "+item+" is found at "+i+"th positon");
				temp++;
			}
		}
		if(temp == 0) {
			System.out.println("Item "+item+" is not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {45,25,41,87,2,0,5,8,9,6,4,5,2,5};
		int item = 5;
		System.out.println("The Array is "+Arrays.toString(arr)+" and the searching item is "+item);
		IntegerLinearSearch.LinearSearch(arr, item);
	}

}
