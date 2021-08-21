package linkedlist;

public class InsertNode {
	
	public Node head; //I created the Node Class in the same package (follow Node.java)
	public InsertNode() {
		this.head = null;
	}
	
	//function for InsertNode
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
	
	//function for print the nodes
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	//driver code
	public static void main(String args[]) {
		InsertNode list = new InsertNode();
		list.InsertNode(41);
		list.InsertNode(54);
		list.InsertNode(51);
		list.print();
		
	}

}
