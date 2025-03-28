package week7.shapes;

public class Rectangle extends Shape {
    private int length;
    private int width;
  
    public Rectangle(int l, int w) {
        super("rectangle");
        length = l;
        width = w;
    }
  
    public Rectangle(){
        super("rectangle");
        length = 20;
        width = 30;
    }
  
    @Override
    public double getArea() {
        return length * width;
    }
  
    @Override
    public String toString(){
        String s = super.toString() + "\n";
        s += "length " + length;
        s += " width " + width;
        return s;
    }
  
    public int getLength() {
        return length;
    }
  
    public int getWidth() {
        return width;
    }
  
    public void setLength(int l) {
        length = l;
    }
  
    public void setWidth(int w) {
        width = w;
    }
}
  