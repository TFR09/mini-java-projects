package week1.pythagoras;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Calculate Pythagoras!");
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = Math.sqrt((a * a)+(b * b));
        System.out.println(c);
    }
}