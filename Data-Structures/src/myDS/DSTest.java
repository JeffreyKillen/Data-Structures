/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myDS;

/*
 * File: DSTest.java
 * Created: 5/17/19
 * Author: Jeffrey Killen - jkillen2@student.umuc.edu
 * Last Update:

 * Description: This class is used to test the custom data structures
 */

public class DSTest {
    
    //Variables//
    
    //AList test variables//
    private static int[] aListTestValuesDefault = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private static int[] aListTestValuesDefined = {8,6,7,5,3,0,9};
    private static AList<Integer> defaultList = new AList<Integer>();
    private static AList<Integer> definedList = new AList<Integer>(8);
    
    public static void testAList() {
        
    ////////////////////////////////////////////////////////////////////////////
        //Test AList DS//
    ////////////////////////////////////////////////////////////////////////////
        
        //populate the list append
        for(int i: aListTestValuesDefault) {
            
            try {
                
                defaultList.append(i);
                System.out.println(defaultList.getValue());
                defaultList.next();
                
            } catch (Exception e) {
                
                System.out.println("Default array error: " + " " + e.getMessage());
                
            } // end of try/catch
            
        } // end of for(int i: aListTestValuesDefault) {
        
        for(int i: aListTestValuesDefined) {
            
            try {
                
                definedList.append(i);
                System.out.println(definedList.getValue());
                definedList.next();
                
            } catch (Exception e) {
                
                System.out.println("Defined array error: " + " " + e.getMessage());
                
            } // end of try/catch         
            
        } // end of for(int i: aListTestValuesDefined) {
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test toTail, getValue()
        defaultList.toTail();
        System.out.println("Default tail value: " + defaultList.getValue());
        
        definedList.toTail();
        System.out.println("Default tail value: " + definedList.getValue());
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test next
        try {
            
            defaultList.next();
            definedList.next();
            
        } catch (Exception e) {
            
            System.out.println("Error in next: " + e.getMessage());
            
        } // end of try/catch
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test prev, getValue()
        try {
            
            defaultList.prev();
            System.out.println("Default list, prev value: " + defaultList.getValue());
            
            definedList.prev();
            System.out.println("Defined list, prev value: " + definedList.getValue());
            
        } catch (Exception e) {
            
            System.out.println("Error in prev: " + e.getMessage());
            
        } // end of try/catch
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test toHead, getVaule()
        defaultList.toHead();
        System.out.println("Default head value: " + defaultList.getValue());
        
        definedList.toHead();
        System.out.println("Default head value: " + definedList.getValue());
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test prev
        try {
            
            defaultList.prev();
            System.out.println("Default list, prev value: " + defaultList.getValue());
            
            definedList.prev();
            System.out.println("Defined list, prev value: " + definedList.getValue());
            
        } catch (Exception e) {
            
            System.out.println("Error in prev: " + e.getMessage());
            
        } // end of try/catch
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test next, getValue()
        try {
            
            defaultList.next();
            System.out.println("Default list, next value: " + defaultList.getValue());
            
            definedList.next();
            System.out.println("Defined list, next value: " + definedList.getValue());
            
        } catch (Exception e) {
            
            System.out.println("Error in next: " + e.getMessage());
            
        } // end of try/catch
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test toPos, getValue()
        try {
            
            //valid pos
            defaultList.toPos(3);
            System.out.println("Default toPos: " + defaultList.getValue());
            
            //invalid pos
            definedList.toPos(42);
            System.out.println("Defined toPos: " + definedList.getValue());
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        } // end of try/catch
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test currentPos
        
        System.out.println("Default lists current Pos: " + defaultList.currentPos());
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test remove
        System.out.println("Default list remove @ pos 3: " + defaultList.remove());
        System.out.println("Default list, value @ pos 3: " + defaultList.getValue());
        
    ////////////////////////////////////////////////////////////////////////////       
        
        //test insert, getValue()
        try {
            
            defaultList.insert(42);
            System.out.println("Default list, value @ pos 3: " + defaultList.getValue());
            definedList.toPos(3);
            definedList.insert(37);
            System.out.println("Defined list, value @ pos 3: " + definedList.getValue());
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        } // end of try/catch
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test length
        System.out.println("Default length: " + defaultList.length());
        
    ////////////////////////////////////////////////////////////////////////////
        
        //test clear
        defaultList.clear();
        System.out.println("Default, post clear, remove: " + defaultList.remove());
        System.out.println("Default, post clear, getValue: " + defaultList.getValue());
        
    } // end of public static void testAList() {
    

    public static void main(String[] args) {
        
        //Test AList DS//
        testAList();
        
        
        
        
    } // end of public static void main(String[] args) {
    
} // end of public class DSTest {
