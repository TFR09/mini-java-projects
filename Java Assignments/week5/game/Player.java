package week5.game;

public class Player {
    private String name;
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int point) {
        score += point;
    }
}
