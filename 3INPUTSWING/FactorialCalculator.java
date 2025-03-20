package TenMarksSwingQuest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame {
    JLabel inputLabel;
    JTextField inputField;
    JButton calculateBtn;
    JLabel resultLabel;
    
    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inputLabel = new JLabel("Enter a Number:");
        inputField = new JTextField(10);
        calculateBtn = new JButton("Calculate");
        resultLabel = new JLabel("");
        
        setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));
        add(inputLabel);
        add(inputField);
        add(calculateBtn);
        add(resultLabel);
        
        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
    }
    
    public void calculateFactorial() {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (number < 0) {
                resultLabel.setText("Please enter a non-negative number.");
            } else {
                long factorial = factorial(number);
                resultLabel.setText("Factorial: " + factorial);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid integer.");
        }
    }
    
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FactorialCalculator fc = new FactorialCalculator();
            fc.setVisible(true);
        });
    }
}
