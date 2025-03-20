/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Bibek Yogi
 */
public class DisplayTU extends Applet {
    @Override
    public void paint(Graphics g){
        g.drawRect(10, 10, 600, 400);
//        g.drawString("Tribhuvan University", 200, 200);
        g.drawOval(260, 150, 100, 100);
        g.fillOval(260, 150, 100, 100);
        
//        g.fillOval(60,60,100,100);
//        g.drawLine(20,20,400,400);
    }
    
    
   
    
}
