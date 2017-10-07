
package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Tariq
 */
public class Menu extends JPanel{
    int option;
    
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        JButton b1 = new JButton("Start Game");
        JButton b2 = new JButton("Help");
        JButton b3 = new JButton("Leader Board");
        JButton b4 = new JButton("Exit");

        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);

        Insets insets = pane.getInsets();
        b1.setBounds(430 + insets.left, 220 + insets.top,
                     140, 30);
        b2.setBounds(430 + insets.left, 270 + insets.top,
                     140, 30);
        b3.setBounds(430 + insets.left, 320 + insets.top,
                     140, 30);
        b4.setBounds(430 + insets.left, 370 + insets.top,
                     140, 30);
    }

    
    static void viewMenu(int option) {
        //Create and set up the window.
        JFrame frame = new JFrame("Tank Game Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(1000 + insets.left + insets.right,
                      600 + insets.top + insets.bottom);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
                viewMenu(0);
    }
}
