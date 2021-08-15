package dsa;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LinkedListTimeCalculate {
	
	static void TimeTaken(List<Integer> list) {
		//note the start time
		long starttime = System.currentTimeMillis();
		
		//now add some elements
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		
		long endtime = System.currentTimeMillis();
		System.out.println("For adding new elements"+list.getClass().getName()+"-->"+(endtime-starttime));
		
		//let's add a new element in 0th index
		long starttime2 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(0, i); 
		}
		long endtime2 = System.currentTimeMillis();
		
		System.out.println("For adding new elements in 0th position"+list.getClass().getName()+"-->"+(endtime2-starttime2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a linkedlist
		List<Integer> linkedlist1 = new LinkedList<>();
		//create a ArrayList
		List<Integer> arraylist = new ArrayList<>();
		
		//now lets count the total time taken to perform some ops
		//call the method
		TimeTaken(linkedlist1);
		TimeTaken(arraylist);
		
	}

}
