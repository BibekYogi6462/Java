/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BroCode;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Bibek Yogi
 */
public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    NewWindow()
    {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        
        frame.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        
        
        
    }
}
