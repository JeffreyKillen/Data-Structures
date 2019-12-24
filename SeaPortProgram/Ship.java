/*
 * FileName: Ship.java
 * Author: Jeffrey
 * Date Created: 10/25/19
 * Last Modified: 11/17/19
 * Purpose: This class serves as the parent to PassengerShip and CargoShip, and
 * defines the fields and methods common to these two classes. These include
 * extending Thing to contain Doubles for weight, length, width, and draft. 
 * The compareTo() and toString() methods are overriden to account for the
 * additional fields added by this class.
 */
package seaportprogram;

import java.util.*;

public class Ship extends Thing {
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Variables
    private Double weight;
    private Double length;
    private Double width;
    private Double draft;
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Constructors
    public Ship(Scanner sc) {
        
        super(sc);
        this.weight = sc.nextDouble();
        this.length = sc.nextDouble();
        this.width = sc.nextDouble();
        this.draft = sc.nextDouble();        
        
    } // end of public Ship(Scanner sc) {
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Methods
    public Double getWeightAsDouble() {
        
        //getter
        
        return this.weight;
        
    } // end of public Double getWeightAsDouble() {
    
    public Double getLengthAsDouble() {
        
        //getter
        
        return this.length;
        
    } // end of public Double getLengthAsDouble() {
    
    public Double getWidthAsDouble() {
        
        //getter
        
        return this.width;
        
    } // end of public Double getWidthAsDouble() {
    
    public Double getDraftAsDouble() {
        
        //getter
        
        return this.draft;
        
    } // end of public Double getDraftAsDouble() {
    
/////////////////////////////////////////////////////////////////////////////////
    
    public String getWeight() {
        
        //getter
        
        return this.weight.toString();
        
    } // end of public String getWeight() {
    
    public String getLength() {
        
        //getter
        
        return this.length.toString();
        
    } // end of public String getLength() {
    
    public String getWidth() {
        
        //getter
        
        return this.width.toString();
        
    } // end of public String getWidth() {
    
    public String getDraft() {
        
        //getter
        
        return this.draft.toString();
        
    } // end of public String getDraft() {
    
/////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String toString() {
        
        //Placeholder method. Add Jobs here in Project 3
        
        String st = super.toString() + "\t" + this.getWeight() + "\t" 
                + this.getLength() + "\t" + this.getWidth() + "\t"
                + this.getDraft();
        //add Jobs here
        
        return st;
        
    } // end of public String toString() {
    
    @Override
    public boolean compareTo(String searchParameter) {
        
        //Overriden method to compare this classes fields in addition to
        //its inherited fields.
        
        if(super.compareTo(searchParameter))
            return true;
        
        if((searchParameter.equals(this.getWeight())) || (searchParameter.equals(this.getLength()))
                || (searchParameter.equals(this.getWidth())) || (searchParameter.equals(this.getDraft())))
            return true;
        
        return false;
        
    } // end of public String comparTo(String searchParameter) {
    
/////////////////////////////////////////////////////////////////////////////////
    
    public void chooseParentByType(Thing candidateParent) {
        
        //Instance method for all Ships to determine if the parent Thing
        //is the Que or a Dock
        //Added to parent
        
        if (candidateParent instanceof Dock) {
                        
            Dock dk = (Dock) candidateParent;
            dk.setShip(this);

        } else {

            SeaPort sp = (SeaPort) candidateParent;
            sp.getQue().add(this);

        } // end of if (mapOfThings.get(sh.getParent()) instanceof Dock) { ... else
        
    } // end of public void chooseParentByType(Thing candidateParent, Ship sh) {
    
} // end of public class Ship extends Thing {
