/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

/**
 *
 * @author Bibek Yogi
 */
import javax.swing.*;
import java.awt.*;

public class LightweightComponentsExample {
    public static void main(String[] args) {
        
    
    JFrame frame = new JFrame("Lightweight Components Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,200);
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.PINK);
    
    JLabel label = new JLabel("Hello, Swing");
    label.setFont(new Font("Arial",Font.BOLD,16));
    label.setForeground(Color.BLUE);
    
    JButton button = new JButton("Click ME");
    panel.add(label);
    panel.add(button);
    frame.getContentPane().add(panel);
    frame.setVisible(true);
    
    
            }
}
