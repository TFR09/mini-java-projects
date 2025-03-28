package week1.even;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Even and positive number");
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            num = scan.nextInt();
        }
        if ((num % 2 == 0) && (num > 0)) {
            System.out.println("even positive number");
        }
        else System.out.println("wrong");
    }
}