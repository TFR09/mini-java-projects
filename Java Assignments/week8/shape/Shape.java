package week8.shape;

import java.util.Random;

public abstract class Shape implements IShape, Positionable {
    private String name;
    private Point position;

    public Shape(String name) {
        this.name = name;
        position = new Point();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void move(int x, int y) {
        int newX = position.getX() + x;
        int newY = position.getY() + y;
        position.setX(newX);
        position.setY(newY);
    }

    public void reset(){
        Random r = new Random();
        position.setX(r.nextInt(11));
        position.setY(r.nextInt(11));
    }

    public String representation(){
        return "";
    }

    public String toString() {
        return name + " " + position.toString();
    }
}

