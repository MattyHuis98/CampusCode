/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis21;

/**
 *
 * @author PT97BDM91
 */
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

    JButton button;
    JPanel pane;
    JLabel label;
    JLabel label2;

    public MyFrame() {
        super("This is my frame");
        setBounds(500, 500, 250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("The Button.");

        add(button);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setSize(100, 50);
        button.setLocation(new Point(75, 100));

        pane = new JPanel();
        label = new JLabel();
        pane.add(label);
        label.setText("Button Position is: (" + button.getLocation().getX() + ", " + button.getLocation().getY() + ")");

        label2 = new JLabel();
        pane.add(label2);
        label2.setText("There are " + pane.getComponentCount() + " components in this panel.");
        label2.setForeground(Color.RED);

        add(pane);
        
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
    }
}
