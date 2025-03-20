/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Bibek Yogi
 */
public class FirstAwt extends WindowAdapter {
    Frame f1;

FirstAwt()
{
f1 = new Frame();
f1.setSize(400,200);
f1.addWindowListener(this);
f1.setVisible(true);


}
    public static void main(String[] args) {
        new FirstAwt();
    }
    
    public void WindowClosing(WindowEvent e)
    {
     f1.dispose();   
    }
}