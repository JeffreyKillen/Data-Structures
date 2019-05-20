/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myDS;

/*
 * File: List.java
 * Created: 5/16/19
 * Author: Jeffrey Killen - jkillen2@student.umuc.edu
 * Last Update:

 * Description: This is the generic interface for a list data structure.

 * Reference: Shaffer, C. A. (2012). Data Structures and Algorithm Analysis 
 * in Java, Third Edition (3rd ed.). Retrieved from 
 * http://people.cs.vt.edu/~shaffer/Book/JAVA3elatest.pdf
 */

public interface List<E> {
    
    //Remove all elements from the list
    public void clear();
    
    //Insert a new element into the list at the current position
    public void insert(E element);
    
    //Append a new element to the end of the list
    public void append(E element) throws Exception;
    
    //Remove and return the current element
    public E remove();
    
    //Move to the head of the list
    public void toHead();
    
    //Move to the tail of the list
    public void toTail();
    
    //Move to the previous element in the list
    public void prev() ;
    
    //Move to the next element in the list
    public void next() throws Exception;
    
    //Return the length of the list
    public int length();
    
    //Return the index of the current position in the list
    public int currentPos();
    
    //Move to a supplied position in the list
    public void toPos(int index) throws Exception;
    
    //Return the value of the current element
    public E getValue();
    
} // end of public interface List<E> {
