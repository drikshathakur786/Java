import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.offerFirst("Start");
        deque.offerLast("End");
        System.out.println(deque);


        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);


        // condition when offerFirst and offerLast will return false
        Deque<String> deque1 = new LinkedBlockingDeque<>(2);
        deque1.offerLast("A");  // true
        deque1.offerLast("B");  // true
        boolean result = deque1.offerLast("C");
        System.out.println(deque1);
        System.out.println(result); // returns false (deque is full)

        // fifo operations
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }

}
