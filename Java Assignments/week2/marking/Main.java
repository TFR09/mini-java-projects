package week2.marking;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Marking");
        float average, total = 0;
        int A = 0, F = 0;
        int[] marks = new int[15];
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = kb.nextInt();
            total += marks[i];
            if (marks[i] >= 70) {
                A++;
            } else if (marks[i] < 40) {
                F++;
            }
        }
        average = (total / marks.length);
        System.out.println(average);
        System.out.println(A);
        System.out.println(F);
    }
}