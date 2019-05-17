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
    
    //Methods//
    
    //Remove all elements from the list
    @Override
    public void clear() {
        
        //Reset variables
        elements = 0;
        curPos = 0;
        
    } // end of public void clear() {
    
    //Insert a new element into the list at the current position
    @Override
    public void insert(E element) throws Exception {
        
        //Check the list is not full
        if(maxSize <= elements) {throw new Exception("The list is full");}
        
        //Shift all following elements
        //Start at the end of the list and work backward
        for(int i = elements; i > curPos; i--) {
            
            //Set the current index i to the previous index i-1
            aList[i] = aList[i-1];
            
        } // end of for(int i = elements; i > curPos; i--) {
        
        //Assign element to index curPos, increment elements
        aList[curPos] = element;
        elements++;
        
    } // end of public void insert(E element) {
    
    //Append a new element to the end of the list
    @Override
    public void append(E element) throws Exception {
        
        //Check the list is not full
        if(maxSize <= elements) {throw new Exception("The list is full");}
                
        //Increment elements, assign element to index elements
        aList[elements++] = element;
        
        
    } // end of public void append(E element) throws Exception {
    
    //Remove and return the current element
    @Override
    public E remove() {
        
        //Make sure there is a current element
        if((curPos >= elements) || (curPos < 0)) {
            
            return null;
            
        } // end of if(curPos >= elements) {
        
        //Store pointer to current element
        E temp = aList[curPos];
        
        //Shift all following list elements back
        for(int i = curPos; i < elements-1; i++) {
            
            aList[i] = aList[i+1];
            
        } // end of for(int i = curPos; i < elements-1; i++) {
        
        //Decrement elements
        elements--;
        
        return temp;
        
    } // end of public E remove() {
    
    //Move to the head of the list
    @Override
    public void toHead() {
        
        //Set the curPos to 0
        curPos = 0;
        
    } // end of public void toHead() {
    
    //Move to the tail of the list
    @Override
    public void toTail() {
        
        //Set the curPos to last element
        curPos = elements - 1;
        
    } // end of public void toTail() {
    
    //Move to the previous element in the list
    @Override
    public void prev() throws Exception {
        
        if(curPos > 0) {
            
            //Decrement curPos
            curPos--;
            
        } else {
            
            throw new Exception("Cannot move beyond beginning of list");
            
        } // end of if(curPos > 0) { ... else 
        
    } // end of public void prev() {
    
    //Move to the next element in the list
    @Override
    public void next() throws Exception {
        
        if((curPos >= elements - 1) && (elements == maxSize)) {
            
            throw new Exception("Cannot move beyond end of list");
            
        } else {
            
            //Increment curPos
            curPos++;
            
        } // end of if(curPos < elements -1) { ... else
        
    } // end of public void next() {
    
    //Return the length of the list
    @Override
    public int length() {
        
        return elements;
        
    } // end of public int length() {
    
    //Return the index of the current position in the list
    @Override
    public int currentPos() {
        
        return curPos;
        
    } // end of public int currentPos() {
    
    //Move to a supplied position in the list
    @Override
    public void toPos(int index) throws Exception {
        
        if((index >= 0) && (index <= maxSize-1)) {
            
            curPos = index;
            
        } else {
            
            throw new Exception("That index does not exist");
            
        } // end of if((index >= 0) && (index <= maxSize-1)) { ... else
        
    } // end of public void toPos(int index) throws Exception {
    
    //Return the value of the current element
    @Override
    public E getValue() {
        
        //Make sure there is an element to return
        if((elements > 0) && (curPos < elements)) {
            
            return aList[curPos];
            
        } else {
            
            return null;
            
        } // end of if(elements > 0) { ... else
        
    } // end of public E getValue() {
    
} // end of 
