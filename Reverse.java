package mock;

public class Reverse {
	
	static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	public static Node head;
	//print
	
		public static void print(Node head) {
			Node ptr = head;
			while(ptr != null) {
				System.out.print(ptr.data+" ");
				ptr = ptr.next;
			}
		}

	
	//reverse
	public static Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		while(current != null) {
			Node next = current.next;
			current.next = prev;
			prev=current;
			current = next;
		}
		return prev;
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] keys = {1,2,3,4,5,6, 7};
		
		Node head = null;
		for(int i=keys.length-1; i>=0; i--) {
			head = new Node(keys[i], head);
		}
		System.out.println("Before Reverse :");
		print(head);
		head = reverse(head);
		System.out.println();
		System.out.println("After Reverse :");
		print(head);

	}

}
