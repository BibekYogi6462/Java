/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BroCode;

import Swing.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Bibek Yogi
 */
public class Jpanel {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("Jwilliamson.jpg");
        
        
        
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setBounds(100,500,200,200);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250); //x cordinate, y cord, , width,height
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250); //x cordinate, y cord, width, height
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250); //x cordinate, y cord, , width
        
        
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        
        redPanel.add(label);
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        
    }
}
