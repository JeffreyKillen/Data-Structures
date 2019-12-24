/*
 * FileName:
 * Author:
 * Date Created:
 * Last Modified:
 * Purpose:
 */
package homework4;

import java.util.concurrent.*;

public class ConcurrencyTest {

    //Variables
    private static ConcurrentHashMap hashMap = new ConcurrentHashMap();
    private static String one;
    private static String two;
    
    public static void main (String args []) {
        
        System.out.println(one);
        System.out.println(two);
        hashMap.put("Key", "Value");
        one = (String) hashMap.remove("Key");
        two = (String) hashMap.remove("Not Real");
        System.out.println(one);
        System.out.println(two);
        two = one;
        one = (String) hashMap.remove("Not Real");
        hashMap.put("Key", two);
        System.out.println(one);
        System.out.println(two);
        
     
    } // end main

} // end class ConcurrencyTest
