package week2.noughtsAndCrosses;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare and intitialise the board
        char[][] board = new char[3][3];

        // initialise all the elements to '.' we use this to indicate that a 
        // square is empty, because a space character would not be visible
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '.';
            }
        }

        //The first player is X
        char thisPlayer = 'X';
        boolean finished = false;
        
        // Amend the program to make it stop 
        do
        {
        int counter = 0;
        //Display the board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (board[row][col] == '.') {
                    counter++;
                }
            }
            System.out.println();
        }
        finished = (counter == 0) ? true:false;
        
        // Ask the user where to place the next character and add it to the board
        if (finished == false){
            System.out.println("Character to be placed is " + thisPlayer);
            System.out.print("Enter the row at which you wish to place it> ");
            int row = scanner.nextInt();
            System.out.print("Enter the column at which you wish to place it> ");
            int col = scanner.nextInt();
            board[row][col] = thisPlayer;
        }
        // Change this Player: If the last character placed was 'X' then the next must be 'O'
        // and vice versa
        thisPlayer = (thisPlayer == 'X') ? '0':'X'; 
        
        } while (!finished);
    }
}