package linkedlist;

public class InsertNewNode {
	
	//create a Node Class
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//function for InsertNode
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
	
	//function for print
	public void print(){
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//driver code
	public static void main(String args[]) {
		InsertNode list = new InsertNode();
		
		list.InsertNode(45);
		list.InsertNode(54);
		list.InsertNode(87);
		list.print();
		
	}

}
