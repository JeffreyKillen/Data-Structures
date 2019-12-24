/*
 * FileName: Discussion3CMSC330.java
 * Author: Jeffrey Killen 
 * Date Created: 11/6/2019
 * Last Modified:
 * Purpose: A short example of Compartors
 */
package discussion3cmsc330;

import java.util.*;

public class Discussion3CMSC330 {  //335 Whoops
    
//////////////////////////////////////////////////////////////////////////////////    
    
    public class Car implements Comparable<Car> {
    
        String make;
        Double cost;
        Integer year;

        public int compareTo(Car c1) {

            //Return the result of the String.compareTo() instance of this.make

            return this.make.compareTo(c1.getMake());

        } // end of public int compareTo(String make) {
        
        public String getMake() {
            
            return this.make;
            
        } // end of public String getMake() {
        
        public Double getCost() {
            
            return this.cost;
            
        } // emd of public String getModel() {

        public Integer getYear() {

            return this.year;

        } // end of public Integer getYear() {
    
    } // end of public class Car implements Comparable<String> {
    
/////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        
        //Collect.sort(someCollection<Object>);
        
        ArrayList<Car> cars = new ArrayList<>();
        
/////////////////////////////////////////////////////////////////////////////////
        
        class SortCarsByYear implements Comparator<Car> {
            
            public int compare(Car c1, Car c2) {
                
                //Return the result of the Integer.compareTo() instance of this.year 
                
                return c1.getYear().compareTo(c2.getYear());

            } // end of public int compare(Car c1, Car c2) {
        
        } // end of class SortCarsByYear implements Comparator<Car> {
        
/////////////////////////////////////////////////////////////////////////////////
        
        class SortCarsByCost implements Comparator<Car> {
        
            public int compare(Car c1, Car c2) {
                
                //Return the result of the Double.compareTo() instance of this.cost
                
                return c1.getCost().compareTo(c2.getCost());
                
            } // end of public int compare(Car c1, Car c2) {
        
        } // end of class SortCarsCost implements Comparator<Car> {
        
/////////////////////////////////////////////////////////////////////////////////        

        Collections.sort(cars); //sorts by cars.compareTo() which is just a String.compareTo()
        
        Collections.sort(cars, new SortCarsByYear()); // sorts by Integer.compareTo() instance car.year
        
        Collections.sort(cars, (car1, car2) -> car1.getYear().compareTo(car2.getYear())); // same as the last, only as a lambda
           
    } // end of public static void main(String[] args) {
        
} // end of public class Discussion3CMSC330 {