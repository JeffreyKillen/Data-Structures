/*
 * FileName:
 * Author:
 * Date Created:
 * Last Modified:
 * Purpose:
 */
package threadresubmittest;

import java.util.concurrent.*;

public class ThreadResubmitTest implements Runnable {

    //Variables
    private int number = 0;
    private static ExecutorService fixedTP = Executors.newFixedThreadPool(4);
    
    
    //Constructor
    public ThreadResubmitTest() {
        
        fixedTP.execute(this);
        
    }
    
    //Methods
    @Override
    public void run() {
        
        if(this.number == 0) {
            
            //System.out.println(number);
            number++;
            fixedTP.execute(this);
            return;
            
        }

        System.out.println(number);
        //System.exit(0);
    }
    
    public static void main(String[] args) {
        
        new ThreadResubmitTest();
        //System.exit(0);
        
    }
    
}
