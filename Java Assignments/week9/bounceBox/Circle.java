package week9.bounceBox;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics2D;

 /**
  *
  * @author p0073862
  */
public class Circle extends Shape {
    
    private int radius;
    
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public double getContactRadius() {
        return radius;
    }
    
    public double getMass() {
        return Math.PI * radius * radius;
    }
    
    public void draw(Graphics2D g) {
        g.setColor(getColor());
        double left = getX() - getRadius();
        double top = getY() - getRadius();
        g.fillOval((int) left, (int) top, getRadius() * 2,
            getRadius() * 2);
    }
}
 