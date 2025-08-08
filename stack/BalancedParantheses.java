package stack;
import java.util.*;

public class BalancedParantheses {
    public static void main(String[] args) {
        String expr = "(a+b)*(c+d)";
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for(char ch: expr.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if (stack.isEmpty()){
                    isBalanced = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) isBalanced = false;
        System.out.println(isBalanced);
    }
}
