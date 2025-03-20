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

public class MDIExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame mainFrame = new JFrame("MDI Example");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        
        // Create the desktop pane
        JDesktopPane jd = new JDesktopPane();
        mainFrame.add(jd);

        // Create internal frames
        JInternalFrame frame1 = new JInternalFrame("Internal Frame1", true, true, true, true);
        frame1.setLayout(null);
        frame1.setSize(200, 100);
        frame1.setLocation(50, 50); // Set location to prevent overlap
        frame1.setVisible(true);

        JInternalFrame frame2 = new JInternalFrame("Internal Frame2", true, true, true, true);
        frame2.setLayout(null);
        frame2.setSize(200, 100);
        frame2.setLocation(250, 50); // Set location to prevent overlap
        frame2.setVisible(true);

        JInternalFrame frame3 = new JInternalFrame("Internal Frame3", true, true, true, true);
        frame3.setLayout(null);
        frame3.setSize(200, 100);
        frame3.setLocation(450, 50); // Set location to prevent overlap
        frame3.setVisible(true);

        // Add internal frames to the desktop pane
        jd.add(frame1);
        jd.add(frame2);
        jd.add(frame3);

        // Make the main frame visible
        mainFrame.setVisible(true);
    }
}
