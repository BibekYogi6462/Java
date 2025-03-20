package BroCode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame extends JFrame implements ActionListener {
    JButton button;
    MyJFrame(){
        button = new JButton("Click Me");
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("I am button");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("poo");
        }
        
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}
