package myDS;

/*
 * File: LList.java
 * Created: 5/20/19
 * Author: Jeffrey Killen - jkillen2@student.umuc.edu
 * Last Update: 

 * Description: Linked list implementation of the List interface

 * Reference: Shaffer, C. A. (2012). Data Structures and Algorithm Analysis 
 * in Java, Third Edition (3rd ed.). Retrieved from 
 * http://people.cs.vt.edu/~shaffer/Book/JAVA3elatest.pdf
 */

public class LList<E> implements List {

    ///////////////////////////////////////////////////////////////////////////
    
    //Variables
    private Link<E> head;
    private Link<E> tail;
    private Link<E> current; 
    private int size;
    
    ///////////////////////////////////////////////////////////////////////////
    
    //Constructors
    
    ///////////////////////////////////////////////////////////////////////////
    
    //Methods
    
    //Remove all elements from the list
    public void clear() {
        
        current = head = tail = null;
        
    } // end of public void clear() {
    
    //Insert a new element into the list at the current position
    public void insert(E element) throws Exception {
        
    }
    
    //Append a new element to the end of the list
    public void append(E element) throws Exception {
        
    }
    
    //Remove and return the current element
    public E remove() {
        
        E value = this.current.getValue();
        
        Link<E> temp = this.current;
        
        prev();
        
        this.current.setNext(temp.getNext());
        
        return value;
        
    } // end of public E remove() { 
    
    //Move to the head of the list
    public void toHead() {
        
        this.current = this.head;
        
    } // end of public void toHead() {
    
    //Move to the tail of the list
    public void toTail() {
        
        this.current = this.tail;
        
    } // end of public void toTail() {
    
    //Move to the previous element in the list
    public void prev() {
        
        Link<E> prev = null;
        Link<E> temp = this.head;
        
        while(temp != this.current) {
            
            prev = temp;
            temp = temp.getNext();
            
        } // end of while(temp != current) {
        
        this.current = prev;
        
    } // end of public void prev() {
    
    //Move to the next element in the list
    public void next() throws Exception {
        
        this.current = this.current.getNext();
        
    } // end of public void next() throws Exception {
    
    //Return the length of the list
    public int length() {
        
        return size;
        
    } // end of public int length() {
    
    //Return the index of the current position in the list
    public int currentPos() {
        
    }
    
    //Move to a supplied position in the list
    public void toPos(int index) throws Exception {
        
    }
    
    //Return the value of the current element
    public E getValue() {
        
    }
}
