package BroCode;

import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some Info info", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Really?", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "I warn u!", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error 100%", "Title", JOptionPane.ERROR_MESSAGE);
        
        while(true){
            JOptionPane.showMessageDialog(null, "I warn u!", "Title", JOptionPane.WARNING_MESSAGE);
        }
    }
}
