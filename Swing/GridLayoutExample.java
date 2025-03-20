/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author Bibek Yogi
 */
public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(3,3));
        
        for(int i=1; i<=9; i++)
        {
            panel.add(new JButton("Button "+i));
            
        }
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.getVisible(true);
        
    }
}
