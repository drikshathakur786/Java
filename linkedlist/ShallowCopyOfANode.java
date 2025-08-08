package linkedlist;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node (100);
        System.out.println(a.val);
        Node temp = a; // Shallow copy of a . no new node created
//        Node temp = new Node(100); // deep copy

        temp.val =12;
        System.out.println(a.val);
        System.out.println(temp.val);

        System.out.println(a);
        System.out.println(temp);
    }
}
