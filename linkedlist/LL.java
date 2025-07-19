package linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    // dont want people to access it from outside the class

    public LL(){
        this.size=0;
    }



    public void insertFirst(int value){
        Node node=new Node(value); // create a new node with the value
        node.next=head; // point the new node to the current head
        head=node; // set the new node as the head
        if(tail==null){ // if the list is empty, set the tail to the new node
            tail=head;
        }
        size++; // increment the size of the list

    }


    public void insertLast(int value){

        if(tail==null){
            insertFirst(value); // if the list is empty, insert at the first position
            return;
        }

        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    } 

    public void insert(int val, int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next; 
        }
        
        Node node= new Node(value, temp.next);
        temp.next=node; // point the current node to the new node
    }


    static void forwardPrint(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
    }
    static void backwardPrint(Node head) {
        if(head == null) return; 
        backwardPrint(head.next); 
        System.out.print(head.data + "-"); 
    }

    

    public int deleteFirst(){
        int value=head.value; // store the value of the head node
        head=head.next; // move the head to the next node
        if(head==null){ // if the list is empty, set tail to null
            tail=null;
        }
        size--; // decrement the size of the list
        return value; // return the value of the deleted node
    }

     
    public void display(){
        Node temp=head; // changing temp wont change head
        while(temp!=null){ 
            System.out.println(temp.value + " -> "); 
            temp= temp.next; 
        }
    }

    public class Node{
        private int value;
        // private LL next;
        private Node next;

        // public Node(int value){
        //     this.value=value;
        // }

        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    
}
