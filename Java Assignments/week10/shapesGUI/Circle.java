package week10.shapesGUI;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public Circle() {
        super("Circle");
        radius= 10;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String representation() {
        return "C";
    }

    public String toString() {
        return super.toString() + "radius " + radius;
    }
}
