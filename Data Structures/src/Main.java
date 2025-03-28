public class Main {
    public static void main(String[] args) {
        Queue s = new Queue();
        
        for (int i = 1; i < 11; i++) {
            s.enqueue(i);
            s.show();
        }

        for (int i = 1; i < 8; i++) {
            s.dequeue();
            s.show();
        }

    }
}
