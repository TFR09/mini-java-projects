package week5.game;

public class Game {
    private int numPlayers = 0;
    private Player[] players;
    private Dice[] dice;

    public Game() {
        players = new Player[5];
        dice = new Dice[2];
        for (int i=0; i<2; i++){
            dice[i] = new Dice();
        }
    }
    // Gtter that retuns an array with all the Players
    public Player[] getPlayers() {
        return players;
    }

    // Getter that returns the two Dice
    public Dice[] getDice() {
        return dice;
    }

    // Method that roll the dice and follows the rules of the game
    public int rollDice() {
        dice[0].roll();
        dice[1].roll();
        int d1 = dice[0].getValue();
        int d2 = dice[1].getValue();
        int score = 0;
        if (d1 == 1 && d2 == 1) {
            score = -1;
        }
        else if (d1 == 1 || d2 == 1) {
            score = 0;
        }
        else {
            score += d1 + d2;
        }
        return score;
    }

    // Mthedo to add a Player to the game
    public void addPlayer(Player p) {
        players[numPlayers] = p;
        numPlayers++;
    }

    // PRE 0<=pos < number of players
    // Return the player in the postion given by pos
    public Player getPlayer(int pos) {
        return players[pos];
    }

    // Returnsthe number of player
    public int getNumberPlayers() {
        return numPlayers;
    }

    // Method that is called to play a round of the game. For each player the name
    // and the dice value are displayed
    public void playRound() {
        for (int i=0; i<numPlayers; i++){
            players[i].updateScore(rollDice());
            displayPlayerTurn(players[i]);
        }
    }

    // Method to display the player bame and the rolled dice values
    public void displayPlayerTurn(Player p) {
        System.out.println("Player: "+ p.getName() +" Dice 1: "+ dice[0].getValue() +" Dice 2: "+ dice[1].getValue() +" Total Points:"+ p.getScore()+"\n");
    }

    // Metod returns true if one of the player has reached a score > 100
    public boolean gameOver() {
        for (int i=0; i<numPlayers; i++){
            if(players[i].getScore() >= 100){
                return true;
            }
        }
        return false;
    }
    
    public void getWinner() {
        for (int i=0; i<numPlayers; i++){
            if(players[i].getScore() >= 100){
                System.out.println("Winner is "+ players[i].getName());
            }
        }
    }
}

