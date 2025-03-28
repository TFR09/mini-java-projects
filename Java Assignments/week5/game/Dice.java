package week5.game;

import java.util.Random;

class Dice {
    private int value;

    public Dice() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }
}