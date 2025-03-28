package week2.millionaire;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("While Loops");
        int balance, years = 0;
        Scanner kb = new Scanner(System.in);
        balance = kb.nextInt();
        while (balance < 1000000) {
            years++;
            balance *= 1.05; 
        }
        System.out.println(years);
    }
}
