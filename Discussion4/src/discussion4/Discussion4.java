/*
 * FileName: Discussion4.java
 * Author: Jeffrey Killen
 * Date Created: 11/11/19
 * Last Modified: 11/13/19
 * Purpose: This program is a short demonstration of GUI features JProgressBar, GridBagLayout, Thread.sleep()
 */
package discussion4;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Discussion4 extends JFrame {

    //Controls
    private static JButton startButton = new JButton();
    private static JProgressBar jpb = new JProgressBar(0, 100);    //Play with JProgressBar
    private static JLabel taskLabel = new JLabel();
    
    private static JPanel testPanel = new JPanel();
    private static JTextArea jta = new JTextArea(10, 30);
    private static JScrollPane jsp = new JScrollPane(jta);
    
    private static long startTime;
    private static long stopTime;
    private static double elapsedTime;
    private static double drift;
    private static String output;
    
    private static int sleepTimeMillis = 30; //change this to change time loading takes
    
/////////////////////////////////////////////////////////////////////////////////    
    
    //Constructor
    public Discussion4() {
        
        setParameters();
        
    } // end of public Discussion4() {
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Methods
    private void setParameters() {
        
        //Sets up the values for --
        //frame, listeners, layout, controls
        
        //Frame Parameters
        setTitle("JProgressBar Demonstration");
        setPreferredSize(new Dimension(640, 480));
        setLocationRelativeTo(null);
        
        //Listeners
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitForm();
            }
        });
        
        startButton.addActionListener(e -> startProgressBarDemo());

        //Layout
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        gridConstraints.insets = new Insets(5,5,5,5);
        gridConstraints.anchor = GridBagConstraints.CENTER;
        
        //Control Parameters      
        taskLabel.setText("Loading...");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 3;
        gridConstraints.gridheight = 1;
        getContentPane().add(taskLabel, gridConstraints);
        
        jpb.setIndeterminate(false);
        jpb.setStringPainted(true);
        //gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        //gridConstraints.gridwidth = 3;
        //gridConstraints.gridheight = 1;
        getContentPane().add(jpb, gridConstraints);
        
        testPanel.add(jsp);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.gridwidth = 2;
        //gridConstraints.gridheight = 10;
        getContentPane().add(testPanel, gridConstraints);

        pack();
        
    } // end of private void setParameters() {
        
    private void startProgressBarDemo() {
        
        //Experimenting with the JProgressBar
        
        jpb.setIndeterminate(true);               
                
    } // end of private void startProgressBarDemo() {
    
    private void exitForm() {
        
        //exit the program
        
        System.exit(0);
        
    } // end of private void exitFortm() {
    
    public static void main(String[] args) {
        
        new Discussion4().setVisible(true); //make and GUI and make it visible
        
        //Display the system time in milliseconds
        startTime = System.currentTimeMillis();
        
        //The following loop increments the JProgressBar's progress every
        //30 milliseconds
        
        for(int i = 0; i <= 100; i++) {
            
            jpb.setValue(i);
            
            try {
                
                Thread.sleep(sleepTimeMillis); 
                        
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
                
            } // end of try/catch

        } // end of for(int i = 0; i <= 100; i++) {
        
        //Display the system time in milliseconds again
        stopTime = System.currentTimeMillis();
        
        //Calculate the difference
        elapsedTime = (stopTime-startTime)/1000.0;
        
        //Calculate the drift
        drift = elapsedTime - (sleepTimeMillis / 10);
        
        //Sing it on the mountain
        output = "Loading started at: " + startTime 
                +"\n\nLoading finished finished at: " + stopTime
                +"\n\nTime spent loading: " + elapsedTime + " seconds"
                +"\n\nThat is a time drift of: " + drift + " seconds";
        jta.setText(output);        
        
    } // end of public static void main(String[] args) {
    
} // end of public class Discussion4 extends JFrame {
