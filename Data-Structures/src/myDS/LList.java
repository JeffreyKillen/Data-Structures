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

public class LList<E> implements List<E> {

    ///////////////////////////////////////////////////////////////////////////
    
    //Variables
    private Link<E> head;
    private Link<E> tail;
    private Link<E> current; 
    private int size;
    
    ///////////////////////////////////////////////////////////////////////////
    
    //Constructors
    
    //Default//
    public LList() {
        
        //Create an empty list
        current = head = tail = new Link();
        
    } // end of public LList() {
    
    //Single Empty Link Arg//
    public LList(Link<E> link) {
        
        //This allows LList to serve as a free list
        
        current = head = tail = link;
        
    } // end of public LList(Link<E> link) {
    
    //Value Arg//
    public LList(E value) {
        
        current = head = tail = new Link(value);
        
    } // end of public LList(E value) {
    
    ///////////////////////////////////////////////////////////////////////////
    
    //Methods
    
    //Remove all elements from the list
    @Override
    public void clear() {
        
        current = head = tail = null;
        
    } // end of public void clear() {
    
    //Insert a new element into the list at the current position
    @Override
    public void insert(E element) {
        
        this.current.setNext(new Link(element, this.current.getNext()));
        
    } // end of public void insert(E element) throws Exception {
    
    //Append a new element to the end of the list
    @Override
    public void append(E element) throws Exception {
        
        Link<E> temp = new Link(element);
        this.tail.setNext(temp);
        this.tail = temp;
        
    } // end of public void append(E element) throws Exception {
    
    //Remove and return the current element
    @Override
    public E remove() {
        
        E value = this.current.getValue();
        
        Link<E> temp = this.current;
        
        prev();
        
        this.current.setNext(temp.getNext());
        
        return value;
        
    } // end of public E remove() { 
    
    //Move to the head of the list
    @Override
    public void toHead() {
        
        this.current = this.head;
        
    } // end of public void toHead() {
    
    //Move to the tail of the list
    @Override
    public void toTail() {
        
        this.current = this.tail;
        
    } // end of public void toTail() {
    
    //Move to the previous element in the list
    @Override
    public void prev() {
        
        if(current == head) {
            
            return;
            
        } // end of if(current == head) {
        
        Link<E> prev = null;
        Link<E> temp = this.head;
        
        while(temp != this.current) {
            
            prev = temp;
            temp = temp.getNext();
            
        } // end of while(temp != current) {
        
        this.current = prev;
        
    } // end of public void prev() {
    
    //Move to the next element in the list
    @Override
    public void next() throws Exception {
        
        this.current = this.current.getNext();
        
    } // end of public void next() throws Exception {
    
    //Return the length of the list
    @Override
    public int length() {
        
        return size;
        
    } // end of public int length() {
    
    //Return the index of the current position in the list
    @Override
    public int currentPos() {
        
        Link<E> temp = this.head;
        
        int position;
        
        for(position = 0; current != temp; position++) {
            
            temp = temp.getNext();
            
        } // end of for(position = 0; current != temp; position++) {
        
        return position;
        
    } // end of public int currentPos() {
    
    //Move to a supplied position in the list
    @Override
    public void toPos(int index) throws Exception {
        
        Link<E> temp = this.head;
        
        int position = 0;
        
        while(position != index) {
            
            if (temp.getNext() == null) {
                
                throw new Exception("That position does not exist");
                
            } // end of if (temp.getNext() == null) {
            
            temp = temp.getNext();
            position++;
            
        } // end of while(position != index) {
        
    }
    
    //Return the value of the current element
    @Override
    public E getValue() {
        
        return this.current.getValue();
        
    } // end of public E getValue() {
    
} // end of public class LList<E> implements List {
