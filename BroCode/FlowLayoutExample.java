package BroCode;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); //Bracket vitra ko nalkhne pani hunxa space dina matra ho
        frame.setSize(300, 150); // Set a smaller size for easier demonstration
       
//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(250,250));
//        panel.setBackground(Color.GREEN);
//        
//        // Add multiple buttons to see how they flow
//       
//        panel.add(new JButton("1"));
//        panel.add(new JButton("2"));
//        panel.add(new JButton("3"));
//        panel.add(new JButton("4"));
//        panel.add(new JButton("5"));
//        frame.add(panel);
        


//   JButton button1 = new JButton("1");   yesari garda pani hunxa navaye talako shortcut
//         frame.add(button1);
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        
      
        
        
        frame.setVisible(true);
    }
}
