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
import java.awt.*;
import java.awt.event.*;

public class ClickButtonApplet extends java.applet.Applet {
    private Button clickButton;

    @Override
    public void init() {
        // Create a button labeled "Click Me"
        clickButton = new Button("Click Me");

        // Add action listener to the button
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display message when the button is clicked
                showStatus("Button Clicked!");
            }
        });

        // Add the button to the applet
        add(clickButton);
    }
}

