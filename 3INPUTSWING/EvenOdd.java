/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





import java.awt.event.*; 
import javax.swing.*; 
public class EvenOdd  
{ 
EvenOdd() 
{ 
JFrame jframe=new JFrame("Even or Odd"); 
jframe.setLayout(null); 
jframe.setSize(400, 200); 
jframe.setVisible(true); 
JLabel lblNumber=new JLabel("Enter Number"); 
lblNumber.setBounds(20, 30, 150, 20); 
jframe.add(lblNumber); 
JTextField txtNumber = new JTextField(); 
txtNumber.setBounds(150, 30, 150, 20); 
jframe.add(txtNumber); 
JButton btnCheck=new JButton("Check"); 
btnCheck.setBounds(100, 60, 80, 20); 
jframe.add(btnCheck); 

JLabel lblResult=new JLabel(""); 
lblResult.setBounds(100, 85, 150, 20); 
jframe.add(lblResult); 
btnCheck.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
int a=Integer.parseInt(txtNumber.getText()); 
if(a%2==0) 
lblResult.setText("Even"); 
else 
lblResult.setText("Odd"); 
} 
} 
); 
} 
public static void main(String args[]) 
{ 
SwingUtilities.invokeLater(new Runnable() 
{ 
public void run() 
{ 
new EvenOdd(); 
} 
} 
); 
} 
} 