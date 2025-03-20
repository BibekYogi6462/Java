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
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Mouse Adapter Example");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Create a JLabel to provide instructions
        JLabel label = new JLabel("Click anywhere with the mouse");
        frame.add(label);

        // Create a MouseAdapter to handle mouse events
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Print a message when the mouse is clicked
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        };

        // Add the MouseAdapter to the frame
        frame.addMouseListener(mouseAdapter);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

