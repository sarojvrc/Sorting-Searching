package practice;

class InsertStringNode{

    //let's create a Node Class first
    class Node{
        String data;
        Node next;
        public Node(String data){
           this.data = data;
           this.next = null;
        }
    }

    //create function for InsertStringNode
    public Node head; //this is the head 
    public void InsertStringNode(){
        this.head = null;
    }
    public Node InsertStringNode(String data){
        if(head == null){
            head = new Node(data);
        }else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node(data);
        }
        return head;
    }

    //function for print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //driver code
    public static void main(String args[]){
    	InsertStringNode list = new InsertStringNode();

        list.InsertStringNode("Saroj");
        list.InsertStringNode("Sipan");
        list.InsertStringNode("Lucy");

        list.print();

        System.out.println("The head is "+list.head.data);
    }
}