/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis22;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author PT97BDM91
 */
public final class UsingComponents extends JFrame{

    JLabel label1, label2, label3;
    JButton btn1, btn2;
    JTextField txf1;
    JPasswordField psf1;
    JTextArea txa1, txa2;
    JPanel pane;
    
    public UsingComponents(){
        super("This is my frame");
        setBounds(250, 50, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pane = new JPanel();
        pane.setLayout(new BorderLayout());
        
        UsingLabels();
        UsingButtons();
        UsingTextFields();
        UsingPasswordField();
        //UsingTextArea();
        
        add(pane);
    }
    
    public void UsingLabels(){
        
        label1 = new JLabel();
        label1.setText("This is label 1.");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2 = new JLabel("This is label 2.");
        label2.setLocation(new Point(50, 25));
        label3 = new JLabel("This is label 3.");
        
        pane.add(label1);
        pane.add(label2);
        pane.add(label3);
        
    }
    
    public void UsingButtons(){
        btn1 = new JButton();
        btn2 = new JButton("DISABLED!!");
        btn1.setText("MEMES");
        btn2.setEnabled(false);
        
        btn1.setSize(100, 100);
        btn2.setSize(100, 100);
        btn1.setLocation(new Point(300, 50));
        btn2.setLocation(new Point(400, 50));
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        add(btn1);
        add(btn2);
    
    }
    
    public void UsingTextFields(){
        txf1 = new JTextField(50);
        txf1.setEditable(true); //Sets user input disabled
        txf1.setText("This is the text field i have created");
        pane.add(txf1);
    }
    
    public void UsingPasswordField(){
        psf1 = new JPasswordField(10);
        psf1.setEchoChar('*');
        psf1.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(BorderLayout.SOUTH, psf1);
    }
    
    public void UsingTextArea(){
        txa1 = new JTextArea(3, 4);
        txa2 = new JTextArea("This Is TXA2", 3, 4);
        //txa1.insert("Inserted Text", 2);
        //txa1.append(": Appended String");
        //txa2.setLineWrap(true);
        
        pane.add(txa1);
        pane.add(txa2);
    }
    
    public static void main(String[] args) {
        UsingComponents uComp = new UsingComponents();
        uComp.setVisible(true);
    }
    
}
