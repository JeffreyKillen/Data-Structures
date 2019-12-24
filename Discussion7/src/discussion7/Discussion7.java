/*
 * FileName: Discussion7.java
 * Author: Jeffrey Killen
 * Date Created: 12/4/19
 * Last Modified:
 * Purpose: This program deomonstrates the usage of newFixedThreadPool()
 */
package discussion7;

import java.util.*;
import java.util.concurrent.*;

public class Discussion7 implements Runnable{
    
/////////////////////////////////////////////////////////////////////////////////

    //Variables
    static ExecutorService fixedTP = Executors.newFixedThreadPool(3); 
    static ExecutorService cachedTP = Executors.newCachedThreadPool();
    static Thread thread;
    
/////////////////////////////////////////////////////////////////////////////////
    
    //Constructor
    public Discussion7() {
        
        //Empty Default
        
    } // end of public Discussion7() {
    
/////////////////////////////////////////////////////////////////////////////////
    
    public synchronized void someCodeToRun(int a, int b) {
        
        //take in some numbers and average them
        int c = (a + b) / 2;
        
        System.out.println(c + "\n");
        
    } // end of public void someCodeToRun() {
    
/////////////////////////////////////////////////////////////////////////////////
    
    public void run() {
        
        //Get random values
        //Simulate averaging pixel values
        int a = ThreadLocalRandom.current().nextInt(0, 255);
        int b = ThreadLocalRandom.current().nextInt(0, 255);
        
        someCodeToRun(a, b);
        
    } // end of  public void run() {
    
/////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args) {
        
        //Manual thread managment
        //This is appropriate for a single thread
        thread = new Thread(new Discussion7());
        thread.start();
        
        //But what if you want 10,000 threads
        
        //Un
        
        for(Integer i = 1; i <= 10000; i++) {
        
            ////////////////////
            /*With an executor*/
            ////////////////////
            
            //fixedTP.execute(new Discussion7());
            //cachedTP.execute(new Discussion7());

            /////////////////////////////////
            /*ExecutorService submit() call*/
            /////////////////////////////////
            
            fixedTP.submit(new Discussion7()); // this one works best, the only one that worked with 100,000 loops
            //cachedTP.submit(new Discussion7());

            ///////////////////////////////////////////////////
            /*A different approach to making runnables*/
            /*String creation to slow it down, count to track*/
            ///////////////////////////////////////////////////

            //String curr = i.toString();
            //Runnable task = () -> { System.out.println(curr +"\n"); };
            //fixedTP.execute(task);
            //cachedTP.execute(task);

        } // end of for(int i = 0; i < 1000; i++) {
        
        //Take the rest of the day off
        fixedTP.shutdown();
        cachedTP.shutdown();
        
    } // end of public static void main(String[] args) {
    
/////////////////////////////////////////////////////////////////////////////////
    
} // end of public class Discussion7 implements Runnable{
