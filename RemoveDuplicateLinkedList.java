package mock;

public class RemoveDuplicateLinkedList {
	
	static Node head;
	
	//Node
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//function for remoreduplicate
	void remoreduplicate() {
		Node pick1= null;
		Node pick2 = null;
		Node duplicate = null;
		
		pick1 = head;
		
		while(pick1 != null && pick1.next != null) {
			pick2 = pick1;
			
			while(pick2.next != null) {
				if(pick1.data == pick2.next.data) {
					duplicate = pick2.next;
					pick2.next = pick2.next.next;
					System.gc();
				}else {
					pick2 = pick2.next;
				}
			}
			pick1 = pick1.next;
		}
		
	}
	
	//print
	void print(Node node) {
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicateLinkedList list = new RemoveDuplicateLinkedList();
		list.head = new Node(45);
		list.head.next = new Node(87);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(12);
		list.head.next.next.next.next = new Node(12); //this will be removed
		list.head.next.next.next.next.next = new Node(11); //this will also remove
		list.head.next.next.next.next.next.next = new Node(11); //this will also remove
		
		System.out.println("before removing ");
		list.print(head);
		
		list.remoreduplicate();
		System.out.println("");
		System.out.println("after removing ");
		list.print(head);
		
	}

}
