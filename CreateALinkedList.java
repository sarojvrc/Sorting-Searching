package dsa;
import java.util.LinkedList;
import java.util.List;

public class CreateALinkedList {
	public static void main(String args[]) {
		List<Integer> newlinkedlist = new LinkedList<>();
		
		//add some data
		newlinkedlist.add(45);
		newlinkedlist.add(85);
		newlinkedlist.add(96);
		newlinkedlist.add(3);
		newlinkedlist.add(10);
		
		System.out.println("The Linked List is "+newlinkedlist);
		System.out.println("The Node is "+newlinkedlist.get(0));
		
	}

}
