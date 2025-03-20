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
import java.awt.*;

public class MenuItem {
    public static void main(String[] args) {
        JFrame f = new JFrame("MenuBar");
        f.setSize(400,400);
        f.setLayout(null);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JMenuBar mb= new JMenuBar();
        JMenu i1 = new JMenu("Home");
        JMenu i2 = new JMenu("File");
        JMenu i3 = new JMenu("Save");
        JMenu i4 = new JMenu("Undo");
        JMenu i5 = new JMenu("Redo");
        JMenu i6 = new JMenu("inner");
        
        
        JMenuItem mi1 = new JMenuItem("Back");
        JMenuItem mi2 = new JMenuItem("Innerfile");
        JMenuItem mi3 = new JMenuItem("InnerSave");
        JMenuItem mi4 = new JMenuItem("InnerUndo");
        JMenuItem mi5 = new JMenuItem("InnerUndo");
        JMenuItem mi6 = new JMenuItem("InnerUndo");
        
        i1.add(mi1);
        i1.add(mi2);
        i1.add(mi3);
        i1.add(mi4);
        i6.add(mi5);
        i6.add(mi6);
        
        i1.add(i6);
        
        mb.add(i1);
        mb.add(i2);
        mb.add(i3);
        mb.add(i4);
        mb.add(i5);
        
        f.setJMenuBar(mb);
        
        
        f.setVisible(true);
        
        
    }
}
