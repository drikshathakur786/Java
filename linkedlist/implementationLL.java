package linkedlist;

class SLL{ // sll stands for singly linked list. User defined structure
    Node head;
    Node tail;
    int size; // default value of size is always 0

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
//            head = temp;
//            tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size ++; // bcz you are adding something

    }
    int get(int idx){
        if(idx==size -1) return tail.val;
        if(idx>=size || idx<0){
            System.out.println("Invalid Index!");
            return -1;
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        if(idx==size -1) tail.val = val;
        if(idx>=size || idx<0){
            System.out.println("Invalid Index!");
            return -1;
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }

    }
    void insert(int idx, int val){

        if(idx ==0){
            insertAtEnd(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx > size || idx <0){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node();
        Node x = head;
        for(int i=1; i<idx-1; i++){
            x = x.next;
        }
        // insertion
        temp.next = x.next;
        x.next = temp;
        size ++;
    }
    void deleteAtHead() throws Error{
        if(head ==null) throw new Error("List is Empty");
        head = head.next;
        size --;
    }
    void deleteAtTail(int idx) throws Error{
        if(head ==null) throw new Error("List is Empty");
        if(idx<0 || idx>=size)
            throw new Error("Invalid index");
        Node temp = new Node();
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
        size --;
    }
}

public class implementationLL {
    public static void main(String[] args) {

        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
//
//        list.display();
//
//        list.insertAtEnd(24);
//        list.display();

        System.out.println(list.size);
        list.insertAtEnd(23);
        list.insertAtEnd(28);
        System.out.println(list.size);
        list.display();

        System.out.println(list.get(3));
        System.out.println(list.get(5));
        System.out.println(list.get(-1));

        list.set(3,20);
        list.display();

        list.deleteAtHead(3);
        list.display();
        list.size();
    }
}



class Address{

}