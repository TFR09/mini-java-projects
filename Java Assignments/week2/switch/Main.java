import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Operations");
        float a, b;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = kb.nextInt();
        b = kb.nextInt();
        System.out.println("Enter operation");
        String operator = kb.next();

        switch (operator)
        {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
    }
}