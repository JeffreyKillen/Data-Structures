/*
 * FileName:
 * Author:
 * Date Created:
 * Last Modified:
 * Purpose:
 */
package discussion3cmsc330; //335 Whoops

/**
 *
 * @author Jeffrey
 */
public class Car implements Comparable<String> {
    
    String make;
    String model;
    Integer year;
    
    public int compareTo(String make) {
        
        //Return the result of the String.compareTo() instance of this.make
        
        return this.make.compareTo(make);
        
    } 
    
    public Integer getYear() {
        
        return this.year;
        
    }
    
}
