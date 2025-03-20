package BroCode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame implements ActionListener {
    public static void main(String[] args) {
        JButton button = new JButton("Click Me");
        button.setBounds(200, 100, 100, 50); // Set the button's position and size
        button.addActionListener(JFrame);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // Use no layout manager
        frame.setVisible(true);
        frame.add(button); // Add the button to the frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object button = null;
        if(e.getSource() == button){
            System.out.println("poo");
    }
}
}