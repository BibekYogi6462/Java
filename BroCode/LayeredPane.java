package BroCode;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class LayeredPane {
    JLayeredPane layeredPane;

    public LayeredPane() {
        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LayeredPane();
    }
}
