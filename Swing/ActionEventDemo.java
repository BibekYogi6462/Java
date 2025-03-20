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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionEventDemo extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    
    public ActionEventDemo()
    {
        setTitle("Action Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        
        //Create Button
        button =  new JButton("Click ME MF!");
        button.addActionListener(this);
        
        //Add components to frame
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
        
        
        setVisible(true);
        
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
         label.setText("Button Clicked!");   
        }
    }
    public static void main(String[] args) {
        new ActionEventDemo();
    }
    
    
}
