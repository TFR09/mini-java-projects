package week10.shapesGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class Main {

    public static void createShapes(Shapes shapes) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Color col = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            Shape sh;

            if (i % 2 == 0)
                sh = new Circle(20);
            else
                sh = new Rectangle(20, 20);
                
            sh.reset();
            sh.setColour(col);
            shapes.addShape(sh);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        Shapes shapes = new Shapes();

        // Create the frame
        frame.setSize(350, 350);

        createShapes(shapes);

        // Create the panel to draw shapes
        ShapePanel canvas = new ShapePanel(frame.getWidth(), frame.getHeight(), shapes);

        // Create all the buttons for drawing, moving and scaling shapes
        JButton butReset = new JButton("reset");
        JButton butUp = new JButton("\u2191");
        JButton butDown = new JButton("\u2193");
        JButton butRight = new JButton("\u2192");
        JButton butLeft = new JButton("\u2190");
        // Right arrow \u2192

        // add four buttons to move all the shapes 10 places up or down or right or left

        // Buttons will be added to a panel
        JPanel buttons = new JPanel();

        buttons.add(butReset);
        buttons.add(butUp);
        buttons.add(butDown);
        buttons.add(butRight);
        buttons.add(butLeft);

        // add the two panels to the frame with a BoxLayout
        Container content = frame.getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        frame.add(canvas);
        frame.add(buttons);

        // frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // control the reset button to call the method reset
        butReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.reset();
                canvas.repaint();
            }
        });

        // control the moveUp button to call the method reset
        butUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveUp();
                canvas.repaint();
            }
        });

        butDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveDown();
                canvas.repaint();
            }
        });

        butLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveLeft();
                canvas.repaint();
            }
        });

        butRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.moveRight();
                canvas.repaint();
            }
        });
    }
}
