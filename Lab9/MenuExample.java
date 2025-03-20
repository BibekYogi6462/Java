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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Example");

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu labeled "File"
        JMenu fileMenu = new JMenu("File");

        // Create JMenuItems labeled "Open" and "Exit"
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners for the menu items
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open selected");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit selected");
                System.exit(0);
            }
        });

        // Add the menu items to the JMenu
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(fileMenu);

        // Set the JMenuBar for the JFrame
        frame.setJMenuBar(menuBar);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}


