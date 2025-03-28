public class DStack {

    private int capacity = 1;
    private int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (isFull()) {
            expand();
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

        if (size() <= capacity/4) {
            shrink();
        }

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
        return top;
    }

    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private void expand() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
    }

    private void shrink() {
        capacity /= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack; 
    }
    
}
