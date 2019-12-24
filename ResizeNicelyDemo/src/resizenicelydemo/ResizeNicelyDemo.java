
package resizenicelydemo;

// File: ResizeNicelyDemo.java
// Date: Apr 4, 2014
// Author: Nicholas Duchon
// Purpose: demonstrate the meaning of resize nicely

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ResizeNicelyDemo extends JFrame {
   static final long serialVersionUID = 23432L; // stop warning about this
  
   public static void main (String args []) {
      // each new creates a new JFrame
      //new ResizeNicelyDemo (0, 100, 100); // flow
      //new ResizeNicelyDemo (1, 500, 100); // grid
      new ResizeNicelyDemo (2, 900, 100); // border
   } // end main
  
   public ResizeNicelyDemo (int type, int xloc, int yloc) {
      setTitle ("Frame: " + type);
      setLocation (xloc, yloc);
      setVisible (true);
      setSize (300, 300);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
     
      JPanel jpButtons = new JPanel ();
     
      jpButtons.add (new JButton ("One"));
      jpButtons.add (new JButton ("Two"));
      jpButtons.add (new JButton ("Three"));

      JTextArea   jta = new JTextArea (10, 10);
      JScrollPane jsp = new JScrollPane (jta);
      jta.setText (someText (30, 150));
     
      /*switch (type) {
         case 0:
            setLayout (new FlowLayout ());
            add (jpButtons);
            add (jsp);
            break;
         case 1:
            setLayout (new GridLayout (0, 1));
            add (jpButtons);
            add (jsp);
            break;
         case 2:*/
            setLayout (new BorderLayout ());
            add (jpButtons, BorderLayout.NORTH);
            add (jsp, BorderLayout.CENTER);
            //break;
      //} // end select type?
      validate (); // Force drawing GUI elements after adding to frame
   } // end int constructor
  
   // create some random text to fill text area and show scroll bars
   String someText (int rows, int cols) {
      String st = "";
      for (int i = 0; i < rows; i++) {
         for (int j = 1; j <= cols; j++) {
            st += (char)('a' + (i+j)%26);
            if (j % 6 == 0) st += " ";
         } // end for each character
         st += "\n";
      } // end for
      return st;
   } // end someText
  
} // end class ResizeNicelyDemo
