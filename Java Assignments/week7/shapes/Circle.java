package week7.shapes;

public class Circle extends Shape {
    private int radius;
  
    public Circle(int r) {
        super("circle");
        radius = r;
    }
  
    public Circle() {
        super("circle");
        radius = 10;
    }
  
    @Override
    public double getArea() {
        double area = 3.1415 * radius * radius;
        return area;
    }
  
    public double getPerimeter() {
        double perimeter = 2 * 3.1415 * radius;
        return perimeter;
    }
  
    @Override
    public String toString() {
        String s = super.toString() + "\n";
        s += "radius " + radius;
        return s;
    }
  
    public void setRadius(int r) {
        radius = r;
    }
  
    public int getRadius() {
        return radius;
    }
  }