package practice;

class ReverseTheLinkList {
    static Node head; // head of list
     
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;
 
        Node rest = reverse(head.next);
        head.next.next = head;
 
        head.next = null;
 
        return rest;
    }
 
    //print
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
  
 
//driver code
public static void main(String args[])
{
    /* Start with the empty list */
    push(25);
    push(4);
    push(15);
    push(85);
    push(95);
    push(63);
 
    System.out.println("Given linked list");
    print();
 
    head = reverse(head);
 
    System.out.println("Reversed Linked list");
    print();
}
}