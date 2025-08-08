package stack;
import java.util.*;
public class BasicsStack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Stack: "+books);
        System.out.println("Top book: "+books.peek());
        System.out.println("Removing top: "+ books.pop());
        System.out.println(books);

        // check empty and size
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Is stack empty?"+ numbers.isEmpty());
        numbers.push(10);
        numbers.push(20);
        System.out.println(numbers.size());

        // search for element
        Stack<String> colors = new Stack<>();
        colors.push("Red");
        colors.push("Green");
        colors.push("Blue");
        int pos = colors.search("Green");
        System.out.println(pos);

        //iterate elements using loop
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        for(int i=0; i< stack.size(); i++){
            System.out.println(stack.get(i));
        }


    }
}
