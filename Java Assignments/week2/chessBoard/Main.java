package week2.chessBoard;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(" Chess Board");
        String letter,square;
        Scanner kb = new Scanner(System.in);
        letter = kb.next();
        int number = kb.nextInt();
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("g"))
        {
        square = ((number % 2) == 0) ? "white":"black";
        }
        else {
        square = ((number % 2) == 0) ? "black":"white";
        }
        System.out.println(square);
    }
}