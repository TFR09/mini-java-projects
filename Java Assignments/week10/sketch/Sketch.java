package week10.sketch;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class Sketch extends JPanel {
    private static Color OUTSIDE_COLOR = Color.WHITE;
    private String shape;

    public Sketch(int w, int h) {
        setPreferredSize(new Dimension(w, h));
        shape = "circle";
    }

    public void setShape(String s) {
        shape = s;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        final int RADIUS = 20;
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            int x = rand.nextInt(300);
            int y = rand.nextInt(300);
            if (shape.equalsIgnoreCase("circle")) {
                g.fillOval(x, y, RADIUS, RADIUS);
            }
            else {
                g.fillRect(x, y, RADIUS, RADIUS);
            }
        }
    }
}
