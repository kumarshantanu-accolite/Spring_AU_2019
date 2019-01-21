package au.accolite.assignment.taximanagnment;

import java.util.*;

public class TaxiQueueRunnable implements Runnable {
	 private LinkedList<Taxi> taxiQueue;
	    private TaxiStand taxiStand;

	    public TaxiQueueRunnable(LinkedList<Taxi> q, TaxiStand l){
	        taxiQueue = q;
	        taxiStand = l;
	    }

	   public void run() {
	System.out.println("Starting taxiQueue Thread...");
	        while(true) {
	            try {
	                Thread.sleep(60000);
	            } catch (InterruptedException ie) {

	            }
	            Taxi T=new Taxi();
	            
	            
	            T.time=System.currentTimeMillis();
	            taxiQueue.add(T);
	            
	            
	            if(taxiStand.addTaxi(taxiQueue.getFirst()));
	            		taxiQueue.removeFirst();
	        }
	    }
}
