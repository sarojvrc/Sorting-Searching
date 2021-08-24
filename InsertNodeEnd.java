package practice;

public class InsertNodeEnd {
	
	//let's create a Node Class at first
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create the function for InsertNodeatEnd
	public Node head;
	public Node tail;
	
	public void InsertNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	//print function
	public void print() {
		Node temp = head;
		if(temp == null) {
			System.out.println("Linkend List is empty");
			return;
		}else {
			System.out.println("Adding new node at the end...");
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		System.out.println();
		
	}
	
	//driver code
	public static void main(String args[]) {
		//create a InsertNodeEnd object
		InsertNodeEnd list = new InsertNodeEnd();
		
		//let's add some elements into list
		list.InsertNode(10);
		list.print();
		list.InsertNode(14);
		list.print();
		list.InsertNode(15);
		list.print();
		list.InsertNode(11);
		list.print();
		System.out.println("The head is "+list.head.data);
		System.out.println("The tail is "+list.tail.data);
		
	}

}
