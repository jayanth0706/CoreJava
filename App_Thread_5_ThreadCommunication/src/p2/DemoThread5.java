package p2;

import p1.Producer;
import p1.Consumer;

public class DemoThread5 {

    public static void main(String[] args) {
        // Create a shared StringBuffer
        StringBuffer sb = new StringBuffer();
        
        // Instantiate Producer and Consumer objects
        Producer p = new Producer(sb);
        Consumer c = new Consumer(p);
        
        // Create two threads, one for Producer and one for Consumer
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        
        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Producer has minimum priority
        t2.setPriority(Thread.MAX_PRIORITY);  // Consumer has maximum priority
        
        // Start the threads
        t2.start();  // Start consumer first
        t1.start();  // Start producer second
    }
}
