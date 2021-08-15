package dsa;

public class BinarySearchInteger {
	
	//function for binarysearch
	static void binarysearch(int arr[], int item) {
		//first we will find the lower index and higher index
		int low = 0;
		int high = arr.length-1;
		//thn we will find the mid 
		int mid = (low+high)/2;
		int count = 0; //we are taking this if item is not found
		//now we will run the loop for our binary search
		while(low<=high) {
			if(arr[mid] == item) {
				System.out.println("Item "+item+" is found at "+mid+"th position");
				count++;
				break;
			}else if(arr[mid]<item) {
				//if the item is less than mid thn we no need to find with another part of 
				//the array
				low = mid +1;
			}else {
				high = mid -1;
			}
			mid = (low+high)/2;
		}
		if(count == 0) {
			System.out.println("Item not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		//for binary search we have to make sure the given array is a sorted array, without
		//sorted array binary search won't work. if is it not sorted then sort the array 1st, then
		//do binary search
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int item = 10;
		
		//call the method for binary search
		BinarySearchInteger.binarysearch(arr, item);
	}

}
