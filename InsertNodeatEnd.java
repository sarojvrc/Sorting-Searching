package practice;

public class InsertNodeatEnd {
	
	//create a Node Class
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//define head and tail
	public Node head;
	public Node tail;
	
	//insert into InsertNodeAtEnd
	public void InsertNodeAtEnd(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	//print the nodes
	public void print() {
		Node temp = head;
		if(head == null) {
			System.out.println("Empty List");
			return;
		}else {
			System.out.println("New node adding into end..");
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		System.out.println();
	}

	//driver code
	public static void main(String args[]) {
		//create a object
		InsertNodeatEnd list = new InsertNodeatEnd();
		//insert some element
		list.InsertNodeAtEnd(12);
		list.print();
		list.InsertNodeAtEnd(14);
		list.print();
		list.InsertNodeAtEnd(18);
		list.print();
		list.InsertNodeAtEnd(17);
		list.print();
		
		System.out.println("The head is "+list.head.data);
		System.out.println("The tail is "+list.tail.data);
	}
}
