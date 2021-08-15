package dsa;

import java.util.Arrays;

public class StringLinearSearch {
	
	//method for LinearSearch
	static void LinearSearch(String arr[], String item) {
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(item)) {
				System.out.println("Item "+item+" is found at "+i+"th postion");
				temp++;
			}
		}
		if(temp == 0) {
			System.out.println("Item "+item+" not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"Saroj", "Linkan", "Milan", "Lucy"};
		String item = "Saroj";
		System.out.println("Array is "+Arrays.toString(arr)+" and the item is "+item);
		//method for Linear Search
		StringLinearSearch.LinearSearch(arr, item);
	}

}
