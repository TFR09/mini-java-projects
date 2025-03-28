package week10.firstGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {        
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}
