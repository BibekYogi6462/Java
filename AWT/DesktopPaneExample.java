/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Bibek Yogi
 */
import javax.swing.*;

public class DesktopPaneExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JDesktopPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Create a JDesktopPane
        JDesktopPane jd = new JDesktopPane();

        // Create three JInternalFrames
        JInternalFrame frame1 = new JInternalFrame("Internal Frame1", true, true, true, true);
        frame1.setLayout(null);
        frame1.setSize(200, 100);
        frame1.setVisible(true);

        JInternalFrame frame2 = new JInternalFrame("Internal Frame2", true, true, true, true);
        frame2.setLayout(null);
        frame2.setSize(200, 100);
        frame2.setVisible(true);

        JInternalFrame frame3 = new JInternalFrame("Internal Frame3", true, true, true, true);
        frame3.setLayout(null);
        frame3.setSize(200, 100);
        frame3.setVisible(true);

        // Add the JInternalFrames to the JDesktopPane
        jd.add(frame1);
        jd.add(frame2);
        jd.add(frame3);

        // Add the JDesktopPane to the JFrame
        frame.add(jd);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}

