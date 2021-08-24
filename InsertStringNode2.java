package practice;

public class InsertStringNode2 {
	
	//now let's create a Node first
	class Node{
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create a function for InsertString
	public Node head;
	public void InsertString() {
		this.head = null;
	}
	public Node InsertString(String data) {
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
	
	//print function
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	//driver code
	public static void main(String args[]) {
		InsertStringNode2 list = new InsertStringNode2();
		
		list.InsertString("Yoo");
		list.InsertString("It's");
		list.InsertString("Working");
		list.InsertString("Fine");
		
		list.print();
	}
}
