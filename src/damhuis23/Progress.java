/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damhuis23;

import javax.swing.*;

public class Progress extends JFrame {//Example 112

    JLabel lbl1;
    JProgressBar progBar;

    public Progress() {
        super("ProgressBar");
        progBar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
        progBar.setStringPainted(true);
        add(progBar);
        pack();
    }

    void changeBar() {
        for (int i = 0; i < (progBar.getMaximum() + 1); i++) {
            progBar.setValue(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Interupted - " + e);
            }
        }
    }

    public static void main(String[] args) {
        Progress prog = new Progress();
        prog.setVisible(true);
        prog.changeBar();
    }

}
