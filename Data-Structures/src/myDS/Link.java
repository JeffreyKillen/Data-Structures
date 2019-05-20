package myDS;

/*
 * File: Link.java
 * Created: 5/20/19
 * Author: Jeffrey Killen - jkillen2@student.umuc.edu
 * Last Update: 

 * Description: Link nodes for use in a linked list.

 * Reference: Shaffer, C. A. (2012). Data Structures and Algorithm Analysis 
 * in Java, Third Edition (3rd ed.). Retrieved from 
 * http://people.cs.vt.edu/~shaffer/Book/JAVA3elatest.pdf
 */

public class Link<E> {
    
    ///////////////////////////////////////////////////////////////////////////
    
    //Variables
    private E value;
    private Link<E> next;
    
    ///////////////////////////////////////////////////////////////////////////
    
    //Constructors
    
    //Default
    public Link() {
        
        //Create an empty node
        
    } // end of public Link() {
    
    public Link(Link<E> next) {
        
        this.next = next;
        
    } // end of public Link(Link next) {
    
    public Link(E value) {
        
        this.value = value;
        
    } // end of public Link(E value) {
    
    public Link(E value, Link<E> next) {
        
        this.value = value;
        this.next = next;
        
    } // end of public Link(E value, Link next) {
    
    ///////////////////////////////////////////////////////////////////////////
    
    public E getValue() {
        
        return this.value;
        
    } // end of public E getValue() {
    
    public Link<E> getNext() {
        
        return this.next;
        
    } // end of public Link getNext() {
    
    public void setValue(E value) {
        
        this.value = value;
        
    } // end of public void setValue(E value) {
    
    public void setNext(Link<E> next) {
        
        this.next = next;
        
    } // end of public void setNext(Link next) {
    
} // end of public class Link<E> {
