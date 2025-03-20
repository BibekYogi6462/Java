/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bibek Yogi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SUM {
    SUM()
    {
        JFrame frame = new JFrame("Sum of Two Numbers");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(20,30,150,20);
        frame.add(label1);
        
        JTextField field1 = new JTextField();
        field1.setBounds(150,30,150,20);
         frame.add(field1); 
         
        JLabel label2 = new JLabel("First Number:");
        label2.setBounds(20,80,150,20);
        frame.add(label2);
        
        JTextField field2 = new JTextField();
        field2.setBounds(150,80,150,20);
         frame.add(field2);
         
         JButton button = new JButton("SUM");
         button.setBounds(20,150,150,20);
         frame.add(button);
          
         JLabel label3 = new JLabel("");
         label3.setBounds(20,200,150,20);
         frame.add(label3);
         
         button.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 int a = Integer.parseInt(field1.getText());
                 int b = Integer.parseInt(field2.getText());
                 int Sum = a+b;
                 label3.setText("SUM : "+Sum);
             }
         }
         );
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
  new SUM();
}
});
    }
}
