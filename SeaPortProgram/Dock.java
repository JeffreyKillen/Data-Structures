/*
 * FileName: Dock.java
 * Author: Jeffrey Killen
 * Date Created: 10/25/19
 * Last Modified: 11/17/19
 * Purpose: This class is a representation of a dock in the seaport program.
 * Each dock object has a ship, and appropriate getters/setters. The toString()
 * method is overrideen to display both this dock object, and its ship to the user.
 */
package seaportprogram;

import java.util.*;

public class Dock extends Thing {
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Variables
    private Ship ship;
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Constructors
    public Dock(Scanner sc) {
        
        super(sc);
        
    } // end of public Dock(Scanner sc) {
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Methods
    public String getShip() {
        
        //getter
        
        return this.ship.toString();
        
    } // end of public String getShip()
    
    public void setShip(Ship s){
        
        //setter
        
        this.ship = s;
        
    } // end of public void setShip(Ship s) {
    
/////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String toString() {
        
        //Overridden method to display this dock object and its ship to the user
        
        String st = "Dock: " + super.toString();
        st += "\n Ship: " + this.ship;
        
        return st;
        
    } // end of public String toString() {
        
} // end of public class Dock extends Thing {
