class Stack {
    
    private int[] stack;
    private int top;
    
    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }
    
    public void push(int item) {
        if (top < stack.length - 1) {
            stack[++top] = item;
        }
    }
    
    public int pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return -1;
    }
    
    public int peek() {
        if (top >= 0) {
            return stack[top];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
}
