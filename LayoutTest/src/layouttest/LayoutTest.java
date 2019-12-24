/*
 * FileName:
 * Author:
 * Date Created:
 * Last Modified:
 * Purpose:
 */
package layouttest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutTest extends JFrame {

    //Variables
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    
    //Layouts
    FlowLayout flow = new FlowLayout();
    GridLayout grid = new GridLayout(2, 2);
    
    //Constructor
    public LayoutTest() {
        
        this.setLayout(grid); // change layout here
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        
    } // end of public LayoutTest() {
    
    
    public static void main(String[] args) {
        
        new LayoutTest().setVisible(true);
        
    } // end of public static void main(String[] args) {
    
} // end of public class LayoutTest extends JFrame {
