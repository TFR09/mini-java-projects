package week5.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Enter number of players: ");
        Scanner kb = new Scanner(System.in);
        int numPlayers = kb.nextInt();

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter player name: ");
            String name = kb.next();
            game.addPlayer(new Player(name));
        }

        do {
            game.playRound();
        } while (! game.gameOver());

        game.getWinner();
    }
}

