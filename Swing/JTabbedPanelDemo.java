/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

/**
 *
 * @author Bibek Yogi
 */
import javax.swing.*;
public class JTabbedPanelDemo {
    
    public JTabbedPanelDemo(){
    JFrame frame =  new JFrame("JLabel and Icon Demo");
    frame.setSize(400,400);
    
    JTabbedPane jtp = new JTabbedPane();
    jtp.addTab("Cities",new CitiesPanel());
    jtp.addTab("Colors",new ColorPanel());
    jtp.addTab("Flavors",new FlavorPanel());
    frame.add(jtp);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}
public static void main(String[] args){
new JTabbedPanelDemo();

}
}

class CitiesPanel extends JPanel{
    public CitiesPanel ()
    {
        JButton b1 = new JButton("Kathmandu");
        add(b1);
        JButton b2 = new JButton("Kathmandu");
        add(b2);
        JButton b3 = new JButton("Kathmandu");
        add(b3);

    }
}

class ColorPanel extends JPanel{
    public ColorPanel()
    {
        JCheckBox c1 = new JCheckBox("Red");
        add(c1);
        JCheckBox c2 = new JCheckBox("Yellow");
        add(c2);
        JCheckBox c3 = new JCheckBox("Black");
        add(c3);
        
    }
}


class FlavorPanel extends JPanel{
    public FlavorPanel()
    {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vannilla");
        jcb.addItem("Vannilla");
        jcb.addItem("Vannilla");
        add(jcb);
    }
}