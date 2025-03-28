package week9.entities;

import java.util.Random;

public class Wizard extends Entity {
    private int age;

    public Wizard(String name, int age) {
        super(name);
        this.age = age;
        setSymbol("@");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String s = super.toString() + "\n";
        s += "age " + age;
        return s;
    }

    public void move() {
        Random r = new Random();
        int x = r.nextInt(101);
        int y = r.nextInt(101);
        setPosition(x, y);
    }
}