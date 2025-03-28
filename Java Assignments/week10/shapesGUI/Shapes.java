package week10.shapesGUI;

import java.util.ArrayList;

public class Shapes implements Positionable {
    private ArrayList<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    Shape getShape(int pos) {
        return shapes.get(pos);
    }

    int getNumberOfShapes() {
        return shapes.size();
    }

    public void move(int x, int y) {
        for (Shape sh : shapes)
            sh.move(x, y);
    }

    public void reset() {
        for (Shape sh : shapes)
            sh.reset();
    }

    private int shapePosition(int x, int y) {
        int index = 0;
        while (index < shapes.size()
            && (shapes.get(index).getPosition().getX() != x || shapes.get(index).getPosition().getY() != y))
        index++;

        if (index == shapes.size()) return -1;
        else return index;
    }

    public String representation() {
        String grid = "";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int index = shapePosition(i, j);
                if (index == -1)
                grid += " ";
                else
                grid += shapes.get(index).representation();
            }
            grid += "\n";
        }
        return grid;
    }
}