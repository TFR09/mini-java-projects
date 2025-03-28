package week9.bounceBox;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.awt.Color;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 
 /**
  *
  * @author p0073862
  */
 public class Main {
 
   /**
    * @param args the command line arguments
    */
 
    public static void main(String[] args) throws FileNotFoundException {
    
        // setupDemo1()
        simpleDemo();
    }
    
    public static void setUpDemo1() {
        BounceBox box = new BounceBox(700, 500);
    
        Circle c1 = new Circle(20, 50, 20);
        c1.setColor(Color.BLUE);
        c1.setVelocity(100, 0);
    
        Circle c2 = new Circle(300, 50, 20);
        c2.setColor(Color.CYAN);
        Circle c3 = new Circle(360, 50, 20);
        c3.setColor(Color.MAGENTA);
        Circle c4 = new Circle(420, 50, 20);
        c4.setColor(Color.ORANGE);
        Circle c5 = new Circle(480, 50, 20);
        c5.setColor(Color.PINK);
        Circle c6 = new Circle(540, 50, 20);
        c6.setColor(Color.RED);
        Circle c7 = new Circle(400, 440, 40);
        c7.setColor(Color.CYAN);
        c7.setVelocity(30, 30);
    
        Circle c8 = new Circle(300, 440, 40);
        c8.setColor(Color.BLUE);
        c8.setVelocity(30, 20);
    
        Circle c9 = new Circle(500, 440, 40);
        c9.setColor(Color.GREEN);
        c9.setVelocity(-20, 30);
    
        Circle c10 = new Circle(120, 50, 20);
        c10.setColor(Color.CYAN);
        Circle c11 = new Circle(180, 50, 20);
        c11.setColor(Color.ORANGE);
        Circle c12 = new Circle(240, 50, 20);
        c12.setColor(Color.PINK);
    
        Square s1 = new Square(120, 120, 40);
        s1.setColor(Color.BLUE);
        s1.setVelocity(30, 20);
    
        Square s2 = new Square(240, 120, 40);
        s2.setColor(Color.GREEN);
        s2.setVelocity(-20, 30);
    
        // c2.setVelocity(-100,0);
        box.addShape(c1);
        box.addShape(c2);
        box.addShape(c3);
        box.addShape(c4);
        box.addShape(c5);
        box.addShape(c6);
        box.addShape(c7);
        box.addShape(c8);
        box.addShape(c9);
        box.addShape(c10);
        box.addShape(c11);
        box.addShape(c12);
    
        box.addShape(s1);
        box.addShape(s2);
    
        box.start();
    }
    
    public static void simpleDemo() throws FileNotFoundException {
        BounceBox box = new BounceBox(500, 500);
    
        FileInputStream fileIn = new FileInputStream("textfiles/shapes3.txt");
        Scanner scan = new Scanner(fileIn);
        while (scan.hasNextLine()) {
            String shape;
            int x, y, r, vx = 0, vy = 0, red = 0, green = 0, blue = 0;
            if (scan.hasNext()) {
                shape = scan.next();
                x = scan.nextInt();
                y = scan.nextInt();
                r = scan.nextInt();
                if (scan.hasNextInt()) {
                    vx = scan.nextInt();
                }
                if (scan.hasNextInt()) {
                    vy = scan.nextInt();
                }
                if (scan.hasNextInt()) {
                    red = scan.nextInt();
                }
                if (scan.hasNextInt()) {
                    green = scan.nextInt();
                }
                if (scan.hasNextInt()) {
                    blue = scan.nextInt();
                }
                if (shape.equals("Circle")) {
                    Shape c = new Circle(x, y, r);
                    c.setColor(new Color(red, green, blue));
                    c.setVelocity(vx, vy);
                    box.addShape(c);
                }
                if (shape.equals("Square")) {
                    Shape s = new Square(x, y, r);
                    s.setColor(new Color(red, green, blue));
                    s.setVelocity(vx, vy);
                    box.addShape(s);
                }
            }
        }

        box.start();
    }
}
 