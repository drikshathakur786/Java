package stack;

// Push at the bottom of Stack
public class QuesOne {

    public static void pushAtBottom(int data, Stack<Integer> s){
        
        // agr stack empty hai
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        // agr stack empty nhi h
        int top= s.pop(); // removed top
        pushAtBottom(data, s);
        s.push(top);

    }

    public static void main(String[] args){
        Stack<Integer> s= new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
    
}
