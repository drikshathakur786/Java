package stack;
// stack using linked list

public class StackLL {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next = null;
        }
        

    }
    static class Stack{
        public static Node head; // ye single ek hee head hai

        // function to check if ll/stack is empty
        public static boolean isEmpty(){
            return head==null;
        }






        public static void push(int data){ // es function k andar humare pass koi data ayega aur es data ko hum linked list k andar push krenge
            Node newNode = new Node(data);
            if(head==null){
                head= newNode; //newnode ko hee head bna dia
                return;
            }

            newNode.next = head; // agr stack empty nahi hai toh head k next wali humari newnode bnjaegi aur fr usi ko head bna denge
            head= newNode;
        }
        






        public static int pop(){
            if(isEmpty()){ // agr stack humara empty hai
                return -1;
            }
            int top= head.data;
            head=head.next;
            return top;
        }





        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data; // top return krdia
        }

    }
    public static void main(String[] args){

        // stack data structure ko actually bnayenge
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){ // jb tk humara set empty ni hoga tb tk sare k sare elements ko print krate jao
            System.out.println(s.peek()); // print
            s.pop();
        }

    }
    
}
