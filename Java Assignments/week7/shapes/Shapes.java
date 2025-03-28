package week7.shapes;

import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public Shape removeShape (int pos) {
        return shapes.remove(pos);
    }

    public Shape getShape(int pos) {
        return shapes.get(pos);
    }

    @Override 
    public String toString() {
        String s = "";
        for(Shape shape: shapes) {
            s += shape.toString() + " ";
        }
        return s;
    }

    public int getNumberOfShapes() {
        return shapes.size();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void translate(int xnum, int ynum) {
        for (Shape shape : shapes){
            int x = shape.getPosition().getX() + xnum;
            int y = shape.getPosition().getX() + ynum;
            shape.move(x, y);
        }
    }
}
