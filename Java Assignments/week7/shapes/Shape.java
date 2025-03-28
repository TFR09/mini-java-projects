package week7.shapes;

public abstract class Shape {
    private String name;
    Point position;
  
    public Shape(String name) {
        this.name = name;
        position = new Point();
    }
  
    @Override
    public String toString(){
        String s = "Shape " + name + " Position " + position.toString();
        return s;
    }
  
    public abstract double getArea();
  
    public String getName() {
        return name;
    }
  
    public void setName(String n) {
        name = n;
    }
  
    public Point getPosition() {
        return position;
    }
  
    public void setPosition(Point p){
        position = p;
    }
  
    public void move(int x, int y) {
        position.setX(x);
        position.setY(y);
    }
}