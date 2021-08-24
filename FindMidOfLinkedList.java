package practice;

public class FindMidOfLinkedList {
	
	//create a Node
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//insert node
	public Node head;
	public void InsertNode() {
		this.head = null;
	}
	public Node InsertNode(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
	
	//find the FindMidEle
	public void FindMidEle() {
		//here we will traverse with 2 pointers, 1 will go 1 step, another will go 2 step
		//forward. If the 2nd pointer reaches the null, then list is finished. That time
		//1st pointer will be the mid point
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println();
		System.out.println("The middle of the list is "+slow.data);
	}
	
	//function for print
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	//driver code
	public static void main(String args[]) {
		FindMidOfLinkedList list = new FindMidOfLinkedList();
		
		//now insert some nodes
		list.InsertNode(45);
		list.InsertNode(78);
		list.InsertNode(10);
		list.InsertNode(96);
		list.InsertNode(10);
		list.InsertNode(90);
		list.InsertNode(80);
		list.InsertNode(98);
		
		//now print it
		list.print();
		
		//now find mid
		list.FindMidEle();
	}

}
