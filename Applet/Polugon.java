/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

/**
 *
 * @author Bibek Yogi
 */
import java.applet.*;
import java.awt.*;
public class Polugon extends Applet {
    int x[] = {40,80,120};
    int y[] = {120,40,120};
    public void paint(Graphics g)
    {
        
     g.drawPolygon(x,y,3);   
    }
}
