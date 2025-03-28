public class Queue {
    
    private int capacity = 10;
    private int[] queue = new int[capacity];
    public static final int start = 0;
    public int end = 0;

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[end] = data;
        end++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        shift();
        end--;

    }

    public int size() {
        return end;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == capacity;
    }

    public void shift() {
        for (int i = 0, s = size() - 1; i < s; i++) {
            queue[i] = queue[i+1];
        }
        queue[size() - 1] = 0;
    }

    public void show() {
        for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
