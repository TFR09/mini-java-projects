package week10.areaGUI;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Areas");

        // Create a panel for the data
        JPanel panelTop = new JPanel();
        JLabel widthLab = new JLabel("Width");
        JTextField width = new JTextField(10);

        JLabel heightLabel = new JLabel("Height");
        JTextField height = new JTextField(10);
        panelTop.add(widthLab);
        panelTop.add(width);
        panelTop.add(heightLabel);
        panelTop.add(height);

        JPanel panelBot = new JPanel();
        JButton button = new JButton("Get Area");
        JLabel areaLabel = new JLabel("Area");
        panelBot.add(button);
        panelBot.add(areaLabel);

        frame.getContentPane().add(BorderLayout.NORTH, panelTop);
        frame.getContentPane().add(BorderLayout.SOUTH, panelBot);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = Integer.parseInt(height.getText());
                int w = Integer.parseInt(width.getText());
                int area = h * w;

                areaLabel.setText(String.valueOf(area));
            }
        });

    }
}