package linkedlist;

// can access this Node class anywhere in this package
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }


}
public class ListNodeClass {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void printRecursive(Node head){
        if(head == null) return;
        System.out.println(head.val);
        printRecursive(head.next);
    }
    public static void main(String[] args) {
           Node a = new Node(10);
//           Node b = new Node(10);
           Node b = new Node (20);
//           System.out.println(a); // address
//  }        System.out.println(a.val); //10
//        System.out.println(a.next); // by default prints null
//        Node b = new Node(10);
//        System.out.println(b); // address will be diff  bcz diff objects no matter the same value
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; // linking => a->b    10 => 20
        b.next = c; // 10 -> 20 -> 30
        c.next = d; // 10 -> 20 -> 30 -> 40
        d.next = e; // 10 -> 20 -> 30 -> 40 -> 50
        // print all val just by using a


        Node temp = a;

        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val); // 10

        temp = temp.next;
        System.out.println(temp.val); // 20

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);

    }
}
