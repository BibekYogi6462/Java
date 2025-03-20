/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author Bibek Yogi
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("FlowLayout Example");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 100);

        // Make the frame visible
        frame.setVisible(true);
    }
}

