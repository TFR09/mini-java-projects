package week10.sketch;

import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");

        frame.setSize(350, 350);
        Sketch canvas = new Sketch(300, 300);

        // Container for the control components
        JPanel controlPanel = new JPanel();

        // RadioButtons
        JRadioButton circleRadio = new JRadioButton("Circles");
        circleRadio.setSelected(true);
        // Add a Radio Button for Square
        JRadioButton squareRadio = new JRadioButton("Squares");

        // Group all the Radio Buttons in a Group
        ButtonGroup group = new ButtonGroup();
        group.add(circleRadio);
        group.add(squareRadio);

        // Add the RadioButtons to the panel
        controlPanel.add(circleRadio);
        controlPanel.add(squareRadio);

        // add a Button here
        JButton but = new JButton("Draw Shapes");
        controlPanel.add(but);

        Container content = frame.getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        frame.add(canvas);
        frame.add(controlPanel);
        canvas.repaint();

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (circleRadio.isSelected())
                canvas.setShape("circle");
                else
                canvas.setShape("square");
                canvas.repaint();
            }
        });

        canvas.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                canvas.repaint();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
    }
}