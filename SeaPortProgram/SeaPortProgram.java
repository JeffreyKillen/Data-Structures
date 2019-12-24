/*
 * FileName: SeaPortProgram.java
 * Author: Jeffrey Killen
 * Date Created: 10/25/19
 * Last Modified: 11/17/19
 * Purpose: This class serves as the GUI for the seaport project. This class
 *  contains the main method for the program. A GUI is displayed for the user.
 *  The user can select a file to load by clicking on the "Open File" button.
 *  Once a file has been selected, and its data loaded, the user can then 
 *  search the data by supplying a value to search for in the given textField.
 */
package seaportprogram;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.File;
        
public class SeaPortProgram extends JFrame {

/////////////////////////////////////////////////////////////////////////////////    
    
    //Variables
    private static World world;
    private static final String title = "Seaport Program";
    
/////////////////////////////////////////////////////////////////////////////////

    //Controls
    private JFileChooser jfc = new JFileChooser(".");
    private JButton openFile = new JButton("Open File");
    private JPanel topPanel = new JPanel();
    private static JTextArea outputText = new JTextArea(10, 10);
    private JScrollPane jsp = new JScrollPane(outputText);
    private JTextField jtf = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    
    private JComboBox<String> jcb = new JComboBox<>(World.getSortCriteria());
    private JLabel sortLabel = new JLabel("Sort:");
    private JButton sortButton = new JButton("Sort");
    private Font font = new Font("Monospaced", 0, 12);
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Constructor
    public SeaPortProgram() {
        
        setParams();
        
    } // end of public SeaPortProgram() {
    
/////////////////////////////////////////////////////////////////////////////////    
    
    //Methods
    private void setParams() {
        
        /*
         * This method sets the initial parameters for the UI elements
         * as well as the window and component listeners
        */
        
        //Frame Parameters
        setTitle(title);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(800, 600));
        
        //Style
        outputText.setFont(font);
        
        //Listeners
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitForm();
            }
        });
        
        openFile.addActionListener(e -> openFileButtonActionPerformed(e));
        
        searchButton.addActionListener(e -> searchButtonActionPerformed(e));
        
        sortButton.addActionListener(e -> { 
            
            String sortType = (String) jcb.getSelectedItem();
            displayOutput(World.sort(sortType));
            
            });
        
        //Layout
        setLayout(new BorderLayout());
        
        topPanel.setLayout(new BoxLayout(topPanel,
                                   BoxLayout.LINE_AXIS));
        topPanel.add(openFile);
        
        topPanel.add(Box.createHorizontalStrut(10));
        topPanel.add(new JSeparator(SwingConstants.VERTICAL));
        topPanel.add(Box.createHorizontalStrut(10));
        
        topPanel.add(jtf);
        topPanel.add(Box.createHorizontalStrut(5));
        topPanel.add(searchButton);
        
        topPanel.add(Box.createHorizontalStrut(10));
        topPanel.add(new JSeparator(SwingConstants.VERTICAL));
        topPanel.add(Box.createHorizontalStrut(10));
        
        topPanel.add(jcb);
        topPanel.add(Box.createHorizontalStrut(5));
        topPanel.add(sortButton);
        
        getContentPane().add(topPanel, BorderLayout.PAGE_START);
        getContentPane().add(jsp, BorderLayout.CENTER);
        
        pack();
        
    } // end of setParames()
    
    private static void exitForm() {
        
        /*
         * This method provides a standard means of exiting the program.
        */
                
        System.exit(0);
        
    } // end of private void exitForm() { 
    
    private static void reportError(Exception ex) {
        
        /*
         * This method is called when there is an error
         * It displays a JOptionPane with the message of the error
        */
        
        // To Do - more robust error reporting
            
        JOptionPane.showMessageDialog(null, ex.getMessage(), ex.getMessage(), JOptionPane.INFORMATION_MESSAGE);
        
        ex.printStackTrace();
        
    } // end of private void reportError(String error) {
    
    private static void reportError(NullPointerException npe) {
        
        //This method handles null pointer exceptions
        //by notifying the user
        
        String error = new String("There is an error with your file selection.");
        npe.printStackTrace();
        
        JOptionPane.showMessageDialog(null, error, error, JOptionPane.INFORMATION_MESSAGE);
        
    } // end of private static void reportError(NullPointerException npe) {
    
    private void openFileButtonActionPerformed(ActionEvent e) {
        
        
        //Get the user to select a file to open
        //Create a Scanner with the File
        //Create a new World with the Scanner
        //Display the World to User
        //Let me know if there are any problems
        jfc.setMultiSelectionEnabled(false);
        jfc.showOpenDialog(null);
        
        // To Do - more robust error reporting
        
        try {
            
            Scanner sc = new Scanner(jfc.getSelectedFile());

            world = new World(sc);
            displayOutput(world.toString());
            
        } catch (NullPointerException npe) {
            
            reportError(npe);
            World.clear();
            
        } catch (Exception ex) {
            
            reportError(ex);
                      
        } // end of try/catch
        
    } // end of private void openFileButtonActionPerformed(ActionEvent e) {
    
    private void searchButtonActionPerformed(ActionEvent e) {
        
        //Get the User input String
        //Search the World
        //Display the results
        //Call me if there is a problem
        try {
        
            String searchParameter = jtf.getText();

            displayOutput(world.search(searchParameter));
            
        } catch(Exception ex) {
            
            reportError(ex);
            
        } // end of try/catch
        
    } // end of private void searchButtonActionPerformed(ActionEvent e) {
    
    public static void displayOutput(String output) {
        
        /*
         * This method serves as an interface to the JTextArea, allowing
         * other objects to set the the text to display
        */
        
        outputText.setText(output);
        
    } // end of public void displayOutput(String output) {
    
///////////////////////////////////////////////////////////////////////////////// 
    
    public static void main(String[] args) {
     
            new SeaPortProgram().setVisible(true);
    
    } // end of public static void main(String[] args) {
    
} // end of public class SeaPortProgram extends JFrame {
