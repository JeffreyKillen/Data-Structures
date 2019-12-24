/*
 * FileName:
 * Author:
 * Date Created:
 * Last Modified:
 * Purpose:
 */
package testconcurrenthashmapcompute;


import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;


public class TestConcurrentHashMapCompute {
    private final ConcurrentHashMap<Integer,Integer> map = 
        new ConcurrentHashMap<Integer,Integer>();
    public TestConcurrentHashMapCompute()
    {
        map.put(1, 1);
        map.put(2, 2);  
    }

    public void update12()
    {
        map.compute( 1 ,            
                new BiFunction<Integer,Integer,Integer>()
                {
                    public Integer apply(Integer k, Integer v) {        
                        map.put( 2 , 1);
                        return v;
                    }
                }
                );
    }

    public void update21()
    {
              map.compute( 2 ,              
                new BiFunction<Integer,Integer,Integer>()
                {
                    public Integer apply(Integer k, Integer v) {        
                        map.put( 1 , 1);
                        return v;
                    }
                }
                );
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

/*
        while(kill==false) {
        
            showStatus(Status.WAITING);

            synchronized(this.sp) {

                shipLabel.setText(this.sp.getName());

                //Is the ship docked?
                if(!this.sp.getIsDocked()) {

                    Random rd = new Random();
                    Dock dk = this.getSeaPort().getDocks().get(rd.nextInt(this.getSeaPort().getDocks().size()));

                    synchronized(dk) {

                        while(dk.getHasShip()) {

                            try{
                                dk.wait();
                            } catch (InterruptedException ie) {} // end of try/catch

                        } // end of while(dk.getHasShip()) {

                        this.sp.dock(dk);

                    } //end of synchronized(dk) {
                } else {

                    synchronized(this.sp.getDock()) {

                        this.sp.dock(this.sp.getDock());

                    } // end of synchronized(this.sp.getDock()) {

                } // end of if/else docked

            } // end of synchronized(this.sp) {

                //thread.sleep
                //The following loop increments the JProgressBar's progress every
                //100 milliseconds

                showStatus(Status.RUNNING);

                for(int i = 0; i <= 100; i++) {

                    jpb.setValue(i);
                    jpb.validate();

                    try {

                        Thread.sleep(100); 

                    } catch (InterruptedException e) {
                    } // end of try/catch

                } // end of for(int i = 0; i <= 100; i++) {


                //sync with ship
                synchronized(this.sp) {

                    showStatus(Status.WAITING);

                    //mark this job done
                    this.sp.decreaseJobsCount();

                    //wait on the other jobs to finish
                    while(this.sp.getHasJobs()) {

                        try{
                            sp.wait();
                        } catch (InterruptedException ie) {} // end of try/catch

                    } // end of while(this.sp.getHasJobs()) {

                    synchronized(this.sp.getDock()) {

                        //Change the flags
                        this.sp.unDock();
                        //notify the next ships
                        this.sp.getDock().notify();

                    } // end of synchronized(this.sp.getDock()) {

                    showStatus(Status.DONE);

                }// end of synchronized(this.sp) {
                
            } // end of while(kill==false) {
            
            
        
        
/////////////////////////////////////////////////////////////////////////////////

            //This method simulates doing some action
        
            showStatus(Status.WAITING);

            //if the ship that owns this job is not docked
            if(!this.sp.getIsDocked()) {

                shipLabel.setText(this.sp.getName());

                //pick a random dock from the port
                Dock dk = this.getSeaPort().getDocks().get(ThreadLocalRandom.current().nextInt(this.getSeaPort().getDocks().size()));

                    //synchronize with it
                    synchronized(dk) {

                        //if it has a ship
                        while(dk.getHasShip()) {

                            //and that ship has jobs
                            if(dk.getMyShip().getHasJobs()) {

                                try {

                                    //wait for them to finish
                                    dk.wait();

                                } catch (InterruptedException ie) {} // end of try/catch

                            //if it does not have jobs
                            } else {

                                //kick it out of the dock
                                dk.getMyShip().unDock();

                            } // end of if(dk.getMyShip().getHasJobs()) {

                        } // end of while(dk.getHasShip()) {

                        //dock
                        this.sp.dock(dk);

                    } // end of synchronized(dk) {

            } // end of if(!this.sp.getIsDocked()) {

            //The following loop increments the JProgressBar's progress every
            //100 milliseconds

            showStatus(Status.RUNNING);
            
            
            //Simulate work
            Runnable updateGui;
            
            for(int i = 0; i <= 100; i++) {
                
                int percentComplete = i;
                
                updateGui = () -> { jpb.setValue(percentComplete);
                    jobPanel.validate();};
                
                try {
                    SwingUtilities.invokeAndWait(updateGui); 
                } catch (Exception e) {} // end of try/catch

                try {

                    Thread.sleep(10); 

                } catch (InterruptedException e) {
                } // end of try/catch

            } // end of for(int i = 0; i <= 100; i++) {

            this.sp.decreaseJobsCount();

                synchronized(this.sp.getDock()) {

                    this.sp.unDock();
                    this.sp.getDock().notify();

                } // end of synchronized(this.sp.getDock()) {

            showStatus(Status.DONE);
            setKillFlag();
        
        } // end of while(kill==false) {
    
    */
