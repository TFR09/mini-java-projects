package week10.converterGUI;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exchange Rate");
        
                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel panelTop = new JPanel();
        JLabel lab1 = new JLabel("Euros");
        JTextField eurosField = new JTextField(5);
        
        JLabel poundsLab = new JLabel("Pounds:         ");
        panelTop.add(lab1);
        panelTop.add(eurosField);
        panelTop.add(poundsLab);

        frame.getContentPane().add(BorderLayout.NORTH, panelTop);
        JPanel panelBot = new JPanel();
        JButton but = new JButton("Convert to Pounds");
        panelBot.add(but);

        frame.getContentPane().add(BorderLayout.SOUTH, panelBot);
            
        frame.pack();
        frame.setVisible(true);

        but.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double pounds = Double.parseDouble(eurosField.getText()) /1.17;
                pounds = Math.round(pounds * 100)/100.0;
                poundsLab.setText("Pounds: "+ String.valueOf(pounds));
            }      
        });
    }
}