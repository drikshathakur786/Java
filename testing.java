class Main {
    public static void main(String[] args) {
        // Stack Test
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());  // 20
        System.out.println(stack.peek()); // 10
        
        // Queue Test
        Queue queue = new Queue(5);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());  // 30
        System.out.println(queue.front());    // 40
    }
}
