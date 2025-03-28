package week9.entities;

import java.util.Random;

public class Hobbit extends Entity {
    private int health;

    public Hobbit(String name) {
        super(name);
        health = 20;
        setSymbol("#");
    }

    public int getHealth() {
        return health;
    }

    public String toString() {
        String s = super.toString() + "\n";
        s += "health " + health;
        return s;
    }

    public void move() {
        Random r = new Random();
        if (health > 0) {
            int step = r.nextInt(3) - 1;
            int x = getPosition().getX() + step;

            step = r.nextInt(3) - 1;
            int y = getPosition().getY() + step;
            
            setPosition(x, y);
            health--;
        }
    }
}