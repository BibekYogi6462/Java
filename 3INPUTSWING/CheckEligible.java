/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class CheckEligible extends JFrame {
    JLabel inputLabel;
    JTextField inputField;
    JButton checkBtn;
    JLabel resultLabel;
    
    public CheckEligible(){
    setTitle("CheckEligible");
    setSize(300,180);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    inputLabel = new JLabel("Enter a Number");
    inputField = new JTextField(10);
    checkBtn = new JButton("Check");
    resultLabel = new JLabel("");
    
    setLayout(new FlowLayout(FlowLayout.LEFT,100,10));
    add(inputLabel);
    add(inputField);
    add(checkBtn);
    add(resultLabel);
    
    
    checkBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            CheckEligible();
        }
    });
    
    
}
    public void CheckEligible(){
        try{
            int number = Integer.parseInt(inputField.getText());
            if(number>18){
                resultLabel.setText("You are eligible");
            }
            else{
                resultLabel.setText("not eleigible");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()->{
        CheckEligible oc = new CheckEligible();
        oc.setVisible(true);
        
    });
    }
}
