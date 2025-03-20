/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BroCode;

import java.awt.Color;
import java.awt.Font;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Bibek Yogi
 */
public class Jlabel {
    public static void main(String[] args) {
//        ImageIcon image = new ImageIcon("Jwilliamson.jpg");
        
        
        
        
        JLabel label = new JLabel(); //Create a label
        label.setText("Bro,do you even code"); //set text of label
//        label.setIcon(image);
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.GREEN,3);

label.setHorizontalTextPosition(JLabel.CENTER);
label.setVerticalTextPosition(JLabel.TOP);
label.setForeground(Color.GREEN);
label.setFont(new Font("Times New Roman",Font.ITALIC,20));
label.setBounds(100,100,250,250);
label.setBackground(Color.black);
label.setOpaque(true);

label.setBorder(border);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        
    }
}
