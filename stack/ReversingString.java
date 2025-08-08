package stack;
import java.util.*;
public class ReversingString {
    public static void main(String[] args) {
        String word= "Hello";
        Stack<Character> stack = new Stack<>();
        for(char ch: word.toCharArray()){
            stack.push(ch);
        }
        System.out.println("Reversed: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
