/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis23;

import java.awt.*;
import javax.swing.*;

public class MyToolBar extends JFrame {//Example 111
    
    ImageIcon openPic, savePic, printPic;
    JButton open, print, save;
    JToolBar bar;
    JTextArea text;
    
    public MyToolBar(){
        super("ToolBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        openPic = new ImageIcon("C:\\Images/open.png");
        savePic = new ImageIcon("C:\\Images/save.png");
        printPic = new ImageIcon("C:\\Images/print.png");
        
        open = new JButton("Open", openPic);
        save = new JButton("Save", savePic);
        print = new JButton("Print", printPic);
        
        bar = new JToolBar();
        bar.add(open);
        bar.add(save);
        bar.add(new JToolBar.Separator());
        bar.add(print);
        
        text = new JTextArea(10, 40);
        add(BorderLayout.NORTH, bar);
        add(BorderLayout.CENTER,text);
        pack();
    }
    
    public static void main(String[] args) {
        MyToolBar toolBar = new MyToolBar();
        toolBar.setVisible(true);
    }
}
