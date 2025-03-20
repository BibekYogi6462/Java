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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo extends JFrame implements KeyListener {
    private JTextField textField;
    
    
    public KeyEventDemo()
    {
     setTitle("Key Event Demo");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,200);
     
     textField = new JTextField();
     textField.addKeyListener(this);
     
     add(textField);
     setVisible(true);
       
    }
    public void keyTyped(KeyEvent e){
        
    }
    public void keyPressed(KeyEvent e){
        textField.setText("Key Pressed: "+KeyEvent.getKeyText(e.getKeyCode()));
        
    }
    public void keyReleased(keyEvent e){
        
    }
    public static void main(String[] args){
        new KeyEventDemo();
    }
    
}
