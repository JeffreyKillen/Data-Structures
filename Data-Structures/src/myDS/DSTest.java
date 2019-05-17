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
    

    public static void main(String[] args) {
        
        //Test AList DS//
        
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
        
        //test toTail, getValue()
        //test next
        //test prev, getValue()
        
        //test toHead, getVaule()
        //test prev
        //test next, getValue()
        
        //test toPos, getValue()
        //test currentPos
        
        //test remove
        
        //test insert, getValue()
        
        //test length
        
        //test clear
        
        
        
        
    } // end of public static void main(String[] args) {
    
} // end of public class DSTest {
