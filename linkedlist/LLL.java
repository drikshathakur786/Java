package linkedlist;

public class LLL {
    Node head;
    private int size;

    LLL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next= next;
        }

    }

    // ADD- first, last
    public void addFirst(String data){
        // agr list exist nhi krti
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        // agr list exist krti hai
        newNode.next = head;
        head= newNode;

    }
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        // traverse ll
        Node currNode= head; // create a node first nd assign the value of head, aur fr ek ek kr k ess current node ko update kro
        while(currNode.next !=null){
            currNode= currNode.next;
        }
        currNode.next= newNode;
    }

    public void printList(){
        // agr head already null hua toh? list already empty huyi toh?
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data+ " -> ");
            currNode= currNode.next;
        }
        System.out.println("NULL");
    }


    // delete first
    public void deleteFirst(){
        // corner case( puri list khali ho)
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        // if list not empty
        head= head.next;
    }

    // delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){ // agr linked list mai ek hee node hai toh uska last null hee hoga
            head==null;
            return;

        }

        Node secondLast= head;
        Node lastNode= head.next; // head.next-> null lastNode-> null
        while(lastNode.next!=null){ // jab tk linked list ka last node null nahi hojata
            lastNode= lastNode.next;
            secondLast= secondLast.next;

        }
    }
    public static void main(String[] args) {
        LLL list= new LLL();

        list.addFirst("a");
        list.addFirst("is");

        list.printList();

        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
    
}
