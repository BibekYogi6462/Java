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
import java.awt.event.*;

public class MDIExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("MDI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a desktop pane
        JDesktopPane desktopPane = new JDesktopPane();

        // Create internal frames
        JInternalFrame internalFrame1 = createInternalFrame("Internal Frame 1");
        JInternalFrame internalFrame2 = createInternalFrame("Internal Frame 2");

        // Add internal frames to the desktop pane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        frame.add(desktopPane);

        frame.setVisible(true);
    }

    private static JInternalFrame createInternalFrame(String title) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(50, 50);
        internalFrame.setVisible(true);
        return internalFrame;
    }
}
