package week9.bounceBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p0074487
 */
public interface Moveable {
    public void move(double time);
  
    public double getX();
  
    public double getY();
  
    public void setVelocity(double vx, double vy);
  
    public double getContactRadius();
  
    public double getMass();
}
  