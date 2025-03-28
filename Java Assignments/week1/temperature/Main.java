package week1.temperature;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Program that converts from centigrade to Fahrenheit");
        float centigrades, fahrenheit; 
        Scanner scan = new Scanner(System.in);
        centigrades = scan.nextInt();
        fahrenheit = ((9 * centigrades) / 5) + 32;
        System.out.println(fahrenheit);
    }
}