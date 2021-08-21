package linkedlist;

public class CreateNodeAndInsertNewNode {
	
	//first create a Node class
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//let's create the InsertNode function
	public Node head;
	public void InsertNode() {
		this.head = null;
	}
	
	public Node InserNode(int data) {
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
		InsertNode list = new InsertNode(); //this is a usermade class
		//call the method for add a node
		list.InsertNode(45);
		list.InsertNode(45);
		list.InsertNode(45);
		list.InsertNode(45);
		list.InsertNode(45);
		list.InsertNode(4525);
		
		//call the method for print this node
		list.print();
		
	}

}
