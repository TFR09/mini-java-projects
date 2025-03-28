package week2.fibonacci;

class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Numbers");
        int[] fibonacci = new int[20];

        fibonacci[0] = 0; fibonacci[1] = 1;
        
        for(int i = 0; i < 20;i++) {
            if (i > 1) fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
            System.out.println(fibonacci[i]);
        }
    }
  }