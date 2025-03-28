package week8.shape;

import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public Shape removeShape(int pos) {
        return shapes.remove(pos);
    }

    Shape getShape(int pos) {
        return shapes.get(pos);
    }

    int getNumberOfShapes() {
        return shapes.size();
    }

    public void translate(int x) {
        for (Shape s:shapes) {
            int moveX= s.getPosition().getX() + x;
            s.move(moveX, s.getPosition().getY());
        }
    }

    public String toString() {
        String s = "SHAPES\n";

        for (Shape sh:shapes){
            s+= sh.toString() + "\n";
        }
        return s;
    }
}

