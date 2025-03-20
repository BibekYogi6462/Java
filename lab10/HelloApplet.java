/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Bibek Yogi
 */
import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        // Get the size of the applet window
        int width = getSize().width;
        int height = getSize().height;

        // Set font and color
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.setColor(Color.BLACK);

        // Calculate the position to center the text
        FontMetrics fm = g.getFontMetrics();
        int x = (width - fm.stringWidth("Hello, Applet!")) / 2;
        int y = (height + fm.getHeight()) / 2;

        // Draw the message in the center of the applet window
        g.drawString("Hello, Applet!", x, y);
    }
}

