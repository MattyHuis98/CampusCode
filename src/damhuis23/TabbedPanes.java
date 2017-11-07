/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis23;

import javax.swing.*;


public class TabbedPanes extends JFrame{//Example 113
    
    JPanel one, two, three, four, five;
    JTabbedPane tab;
    JPanel pane;
    
    public TabbedPanes(){
        super("TabbedPanes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 250, 100);
        one = new JPanel();
        two = new JPanel();
        three = new JPanel();
        four = new JPanel();
        five = new JPanel();
        
        tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        
        tab.addTab("One", one);
        tab.addTab("Two", two);
        tab.addTab("Three", three);
        tab.addTab("Four", four);
        tab.addTab("Five", five);
        add(tab);
    }
    
    public static void main(String[] args) {
        TabbedPanes tPane = new TabbedPanes();
        tPane.setVisible(true);
    }
    
}
