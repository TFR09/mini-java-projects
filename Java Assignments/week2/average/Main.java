package week2.average;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Average");
        Scanner kb = new Scanner(System.in);
        double average,total = 0;
        int input, counter = 0;
        do {
            input = kb.nextInt();
            if (input > 0) counter++;
            total += input;
        } while (input > 0);
        average = (counter == 0) ? 0:total/counter;
        System.out.println(average);
    }
}
