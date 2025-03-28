package week10.shapesGUI;

import java.awt.*;
import java.util.Random;

public abstract  class Shape implements IShape, Positionable {
    private String name;
    private Color colour;
    Point position;

    public Shape(String name) {
        this.name = name;
        colour = Color.BLACK;
        position = new Point();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Point getPosition() {
        return position;
    }

    public Color getColour() { return colour;}

    public void setPosition(Point position) {
        this.position = position;
    }


    public void move(int x, int y) {
        int newX = position.getX()+x;
        int newY = position.getY()+y;

        position.move(newX, newY);

    }

    public void reset() {
        Random random = new Random();
        int x = random.nextInt(300);
        int y = random.nextInt(300);
        position.move(x,y);

    }
    
    public abstract String  representation();
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return name +" " + position.toString();
    }
}
