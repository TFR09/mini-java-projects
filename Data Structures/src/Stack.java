public class Stack {

    private int capacity = 4;
    private int[] stack = new int[capacity];
    private int top = 0;

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        
        stack[top] = data;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;

    }

    public void peek() {
        if (isEmpty()) {
            System.out.print("Stack is empty");
            return;                
        }

        System.out.print(stack[top - 1]);
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public int size() {
        return stack.length;
    }

    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    
}
