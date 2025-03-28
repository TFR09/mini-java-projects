package week10.shapesGUI;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int l, int w){
        super("Rectangle");
        length = l;
        width = w;
    }

    public Rectangle () {
        super("Rectangle");
        width =20;
        length = 30;
    }

    public int getLength() {
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public double getArea() {
        return width*length;
    }

    public double  getPerimeter() {
        return 2* width + 2 * length;
    }

    public String representation() {
        return "R";
    }

    public String toString() {
        return super.toString() + "width: " + width + " length: " + length;
    }
}
