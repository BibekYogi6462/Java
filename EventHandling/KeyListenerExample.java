/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

/**
 *
 * @author Bibek Yogi
 */
import java.awt.*;
import java.awt.event.*;
class KeyListenerExample extends Frame implements KeyListener {
 Label l;
 TextArea area;
 KeyListenerExample()
 {
 l=new Label();
 l.setBounds(20,50,100,20);
 area=new TextArea();
 area.setBounds(20,80,300,300);
 area.addKeyListener(this);
 add(l);
 add(area);
 setTitle("Key Event");
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public void keyPressed(KeyEvent e)
 {
 l.setText("Key Pressed");
 }
 public void keyReleased(KeyEvent e) {
 l.setText("Key Released");
 }
 public void keyTyped(KeyEvent e)
 {
 l.setText("Key Typed");
 }
 public static void main(String[] args)
 {
 new KeyListenerExample();
 }
}
