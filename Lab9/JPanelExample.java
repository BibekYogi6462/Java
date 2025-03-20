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
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class JPanelExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JPanel Example");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Set the layout manager for the JPanel
        panel.setLayout(new FlowLayout());

        // Create buttons labeled "Red", "Green", and "Blue"
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        // Add buttons to the JPanel
        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blueButton);

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}

