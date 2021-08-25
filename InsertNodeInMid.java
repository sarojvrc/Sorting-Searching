package practice;

public class InsertNodeInMid {
	
	//create a node
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head;
	
	//Mid
	static void insertMid(int x)
    {
        if (head == null)
        head = new Node(x);
        else {
            Node newNode = new Node(x);
            Node slow = head;
            Node fast = head.next;
 
            while (fast != null && fast.next
                                  != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
 
            newNode.next = slow.next;
            slow.next = newNode;
        }
    }
	
	//function for print
	static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	//driver code
	public static void main(String args[]) {
		InsertNodeInMid list = new InsertNodeInMid();
		head = null;
		head = new Node(12);
		head.next = new Node(15);
		head.next.next = new Node(20);
		head.next.next.next = new Node(25);
		
		System.out.println("Linked list before insertion: ");
		print();
		
		int x = 85;
		insertMid(x);
		System.out.println("Linked list after insertion at mid: ");
		print();
		
		
	}

}
