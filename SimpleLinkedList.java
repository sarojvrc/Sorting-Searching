package dsa;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> linkedlistexample = new LinkedList<>();
		
		//lets add some elements
		linkedlistexample.add(12);
		linkedlistexample.add(54);
		linkedlistexample.add(125);
		linkedlistexample.add(187);
		linkedlistexample.add(78);
		linkedlistexample.add(125);
		
		System.out.println("The linked list is "+linkedlistexample);
		
		//let's check while element is in the 1st index
		System.out.println("The head is "+linkedlistexample.get(1)); 
		//54 is the 1st index, which is known as head.
		
	}

}
