package stack;

// Reverse a stack
public class QuesTwo {

    
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    

    public static void reverse(Stack<Integer> s){
        // base case
        if(s.isEmpty()){
            return;
        }

        int top= s.pop(); // top pe jo hai usko nikal dia
        reverse(s); // jo chota stack bngya usko call krna
        pushAtBottom(top, s); // ab push krna lekin bottom pe
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }

}
