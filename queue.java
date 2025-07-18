class Queue {
    private int[] queue;
    private int front, rear, size;
    
    public Queue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        this.size = size;
    }
    
    public void enqueue(int item) {
        if (rear < size - 1) {
            queue[++rear] = item;
        }
    }
    
    public int dequeue() {
        if (front <= rear) {
            return queue[front++];
        }
        return -1;
    }
    
    public int front() {
        if (front <= rear) {
            return queue[front];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return front > rear;
    }
}
