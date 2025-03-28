package week10.shapesGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p0074487
 */
public class ShapePanel extends JPanel {
    private Shapes shapes;

    public ShapePanel(int w, int h, Shapes shapes) {
        setPreferredSize(new Dimension(w, h));
        this.shapes = shapes;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < shapes.getNumberOfShapes(); i++) {
            Shape s = shapes.getShape(i);
            g.setColor(s.getColour());
            if (s.getName().equalsIgnoreCase("Circle")) {
                Circle c = (Circle) s;

                g.fillOval(c.getPosition().getX(), c.getPosition().getY(), c.getRadius(), c.getRadius());
            } else {
                Rectangle r = (Rectangle) s;

                g.fillRect(r.getPosition().getX(), r.getPosition().getY(), r.getWidth(), r.getLength());
            }
        }
    }

    public void reset() {
        shapes.reset();
    }

    public void moveUp() {
        shapes.move(0, -10);
    }

    // Add methods to move up, left and right
    public void moveDown() {
        shapes.move(0, 10);
    }

    public void moveLeft() {
        shapes.move(-10, 0);
    }

    public void moveRight() {
        shapes.move(10, 0);
    }
}
