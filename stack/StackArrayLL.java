package stack;

import java.util.ArrayList;
import java.util.List;

public class StackArrayLL {
    class Stack{
        static ArrayList<Integer> list= new ArrayList<Integer>();

        public static boolean isEmpty(){
            return list.size() ==0;
        }

        //push
        public static void push(int data){
            List.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            // arraylist ka last element nikalna hoga phele
            int top= List.get(List.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
