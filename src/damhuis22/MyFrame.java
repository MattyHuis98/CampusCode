/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis22;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author PT97BDM91
 */
public class MyFrame extends JFrame {
    
//Example 97
    /*JLabel name, pass;
    JTextField tf;
    JPasswordField pf;
    JPanel pane;
    
    public MyFrame(){
        super("Login");
        setBounds(200, 200, 200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        name = new JLabel("Enter your name: ");
        tf = new JTextField(10);
        pass = new JLabel("Enter your password:");
        pf = new JPasswordField(10);
        
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        pf.setHorizontalAlignment(SwingConstants.CENTER);
        pf.setEchoChar('$');
        
        pane = new JPanel();
        pane.add(name);
        pane.add(tf);
        pane.add(pass);
        pane.add(pf);
        add(pane);
    }*/
    
    //Example 99
    /*JLabel label;
    JCheckBox cb1, cb2, cb3, cb4, cb5;
    JPanel pane;
    
    public MyFrame(){
        super("Sport");
        setBounds(200, 200, 200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Select your favourite sports:");
        cb1 = new JCheckBox("Rugby");
        cb2 = new JCheckBox("Cricket");
        cb3 = new JCheckBox("Soccer");
        cb4 = new JCheckBox("Hockey");
        cb5 = new JCheckBox("Tennis");
        
        pane = new JPanel();
        pane.add(label);
        pane.add(cb1);
        pane.add(cb2);
        pane.add(cb3);
        pane.add(cb4);
        pane.add(cb5);
        add(pane);
        pack();
    }*/
    
    //Example 100
    String[] food = {"Pizza", "Burgers", "Sandwich", "Hotdogs", "Salad"};
    JComboBox box = new JComboBox();
    JLabel label = new JLabel("What's for lunch?");
    JPanel pane = new JPanel();
    
    public MyFrame(){
        super("Sport");
        setBounds(200, 200, 200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        for (String s : food) {
            box.addItem(s);
        }
        
        pane.add(label);
        pane.add(box);
        add(pane);
        pack();
    }
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
    
}
