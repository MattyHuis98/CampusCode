/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis23;

import javax.swing.*;

public class MyFrame extends JFrame{
    
    public static void Example104(){
        int response = JOptionPane.showConfirmDialog(null, "Do you want to see the second message?");
        if (response == JOptionPane.YES_OPTION){
            JOptionPane.showConfirmDialog(null, "Did you like the first message?", 
                    "second message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
    }
    
    public static void Example105(){
        String response = JOptionPane.showInputDialog(null, "Please enter your name:");
        System.out.println("Respone 1 = " + response);
        if (response == null){//Theres an error in the book?
            JOptionPane.showInputDialog(null, "Surname then?", "Enter your ...", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void Example106(){
        JOptionPane.showMessageDialog(null, "Three billion devices run Java!");
    }
    
    public static void Example107(){
        String[] food = {"Pizza", "Burger", "Something Else"};
        int response = JOptionPane.showOptionDialog(null, "What would you like to eat?", 
                "DINNER CHOICES", 0, JOptionPane.QUESTION_MESSAGE, null, food, food[2]);
    }
    
    //Example 108
    /*public MyFrame(){
        super("ICONS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("I have an icon!", new ImageIcon("C:\\Users\\matth\\Pictures\\java-coffee-cup.png"), SwingConstants.CENTER);
        butt = new JButton("Me too!");
        butt.setIcon(new ImageIcon("C:\\Users\\matth\\Pictures\\oracle.png"));
        
        pane = new JPanel();
        pane.add(label);
        pane.add(butt);
        add(pane);
        pack();
    }*/
    //End of 108
    
    //Example 109
    /*public MyFrame(){
        super("ToolTip Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 250, 100);
        
        txf1 = new JTextField(10);
        txf1.setToolTipText("Enter your name here!");
        
        pane = new JPanel();
        pane.add(txf1);
        add(pane);
        pack();
    }*/
    //End of 109
    
    //Example 110
    /*public MyFrame(){
        super("Slider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 250, 100);
        
        slide = new JSlider(JSlider.HORIZONTAL, -50, 50, 0);
        slide.setMajorTickSpacing(20);
        slide.setMinorTickSpacing(5);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        
        pane = new JPanel();
        pane.add(slide);
        add(pane);
        pack();
    }*/
    //End of 110 
    
    
    static MyFrame frame;
    JLabel label;
    JButton butt;
    JPanel pane;
    JTextField txf1;
    JSlider slide;
    
    public static void main(String[] args) {
        //Example104();
        //Example105();
        //Example106();
        //Example107();
        frame = new MyFrame();
        frame.setVisible(true);
    }
    
}
