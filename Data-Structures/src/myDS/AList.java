/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myDS;

/*
 * File: AList.java
 * Created: 5/16/19
 * Author: Jeffrey Killen - jkillen2@student.umuc.edu
 * Last Update: 5/17/19

 * Description: Implementation of the List interface using an array.

 * Reference: Shaffer, C. A. (2012). Data Structures and Algorithm Analysis 
 * in Java, Third Edition (3rd ed.). Retrieved from 
 * http://people.cs.vt.edu/~shaffer/Book/JAVA3elatest.pdf
 */

public class AList<E> implements List<E> {
    
///////////////////////////////////////////////////////////////////////////////
    
    //Variables//
    
    private static final int DEFAULT_SIZE = 16; //default max list size
    private int maxSize; //user defined max list size
    private int curPos = 0; //current position on the list
    private int elements = 0; //number of elements on the list
    private E[] aList; //the array that serves as the list
    
///////////////////////////////////////////////////////////////////////////////
    
    //Constructors//
    
    //Default//
    public AList() {
        
        //Call defined constructor with DEFAULT_SIZE as the param
        this(DEFAULT_SIZE);
        
    } // end of public AList() {
    
    //User defined size//
    public AList(int size) {
        
        //Assign user defined size to maxSize
        maxSize = size;
        
        //Create a new AList 
        @SuppressWarnings("Unchecked") //casting array to generic type
        E[] list = (E[]) new Object[size];
        aList = list; //fix this to get rid of unnecessary assignment op
        
    } //public AList(int size) {
    
///////////////////////////////////////////////////////////////////////////////
    
    
    //Remove all elements from the list
    @Override
    public void clear() {
        
        //Reset variables
        elements = 0;
        curPos = 0;
        
    } // end of public void clear() {
    
    //Insert a new element into the list at the current position
    @Override
    public void insert(E element);
    
    //Append a new element to the end of the list
    @Override
    public void append(E element);
    
    //Remove and return the current element
    @Override
    public E remove();
    
    //Move to the head of the list
    @Override
    public void toHead();
    
    //Move to the tail of the list
    @Override
    public void toTail();
    
    //Move to the previous element in the list
    @Override
    public void prev();
    
    //Move to the next element in the list
    @Override
    public void next();
    
    //Return the length of the list
    @Override
    public int length();
    
    //Return the index of the current position in the list
    @Override
    public int currentPos();
    
    //Move to a supplied position in the list
    @Override
    public void toPos(int index);
    
    //Return the value of the current element
    @Override
    public E getValue();
    
}
