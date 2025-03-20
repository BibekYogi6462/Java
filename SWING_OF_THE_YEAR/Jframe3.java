/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING_OF_THE_YEAR;
import javax.swing.*;

public class Jframe3 {
    public JFrame jframe;
    public Jframe3(){
        jframe = new JFrame();
        jframe.setTitle("This is Jframe");
        
        JButton jButton = new JButton("Click ME");
        jButton.setBounds(100,40,100,30);
        
        JLabel jlabel = new JLabel("This is Java label");
        jlabel.setBounds(100,90,250,30);
        jframe.add(jlabel);
        
        
        JTextField textfield = new JTextField();
        textfield.setBounds(100,150,250,30);
        jframe.add(textfield);
        
        
        
        jframe.add(jButton);
        
        jButton.addActionListener(new ActionListener(){
        public void actionPeformed(ActionEvent e){
            
         jlabel.setText("Please subscribe");
         
        }
        
        
    });
        
           
        
        
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        
        
    }
    public static void main(String[] args) {
        Jframe3 ns = new Jframe3();
    }
}
