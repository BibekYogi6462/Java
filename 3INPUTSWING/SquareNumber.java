/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;


import java.awt.event.*; 
import javax.swing.*; 
public class SquareNumber  
{ 
SquareNumber() 
{ 
JFrame jframe=new JFrame("Square Calculator"); 
jframe.setLayout(null); 
jframe.setSize(400,200); 
jframe.setVisible(true); 
JLabel lblFirstNumber=new JLabel("Enter any Number: "); 
lblFirstNumber.setBounds(20, 30, 150, 20); 
jframe.add(lblFirstNumber); 
JTextField txtFirstNumber=new JTextField(); 
txtFirstNumber.setBounds(180,30,150,20); 
jframe.add(txtFirstNumber); 
JButton btnSquare=new JButton("Square"); 
btnSquare.setBounds(40, 60, 100, 20); 
jframe.add(btnSquare); 
JLabel lblSquare=new JLabel("Square of Enter Number: "); 
lblSquare.setBounds(20, 90, 150, 20); 
jframe.add(lblSquare); 
JTextField txtSquare=new JTextField(); 
txtSquare.setBounds(180, 90, 150, 20); 
jframe.add(txtSquare); 
btnSquare.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent ae) 
{ 
int a=Integer.parseInt(txtFirstNumber.getText()); 
int square=a*a; 
txtSquare.setText(" "+square); 
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
new SquareNumber(); 
} 
} 
); 
} 
}
