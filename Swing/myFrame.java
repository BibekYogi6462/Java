package Swing;


import javax.swing.*;

public class myFrame{
    JFrame f1;
    myFrame(){
         f1 = new JFrame();
        f1.setSize(400,200);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f1.setVisible(true);
}
    public static void main(String[] args) {
        new myFrame();
    }
}

