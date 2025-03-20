/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Awt;

/**
 *
 * @author thapa
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class studentform extends WindowAdapter{
    Frame f1;
    Label l1,l2,l3,l4;
    TextField t1;
    Button b1;
    Choice c1;
    Checkbox r1,r2,c2,c3;
    studentform(){
        f1=new Frame("Student Form");
        f1.setSize(400,330);
        f1.setLayout(null);
        f1.addWindowListener(this);
        f1.setResizable(false);
        
        l1=new Label("Name");
        l1.setBounds(30,40,80,25);
        
        f1.add(l1);
        
        t1=new TextField(20);
        t1.setBounds(130,40,200,35);
        
        f1.add(t1);
        l2=new Label("Faculity");
        l2.setBounds(30,90,80,25);
        
        f1.add(l2);
        c1=new Choice();
        c1.add("BBA");
        c1.add("BIM");
        c1.add("BBS");
        c1.add("BSW");
        c1.setBounds(130,90,200,5);
        
        f1.add(c1);
        
        l3=new Label("Gender");
        l3.setBounds(30,140,80,25);
        
        f1.add(l3);
        CheckboxGroup gender = new CheckboxGroup();
        r1=new Checkbox("Male",gender,true);
        r1.setBounds(130,140,100,35);
               
        r2=new Checkbox("Female",gender,false);
        r2.setBounds(230,140,100,35);
        
        f1.add(r1);
        f1.add(r2);
        
        l4=new Label("Qualifications:");
        l4.setBounds(30,190,100,25);
        f1.add(l4);
        c2=new Checkbox("+2");
        c2.setBounds(130,190,80,25);
        
        c3=new Checkbox("BA");
        c3.setBounds(220,190,80,25);
        
        f1.add(c2);
        f1.add(c3);
        b1=new Button("Submit");
        //b1.setBounds(150,250);
        f1.addWindowListener(this);
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        new studentform();
    }
    public void windowClosing(WindowEvent e){
        f1.dispose();
    }
}
