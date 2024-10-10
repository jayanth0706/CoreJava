package maccess;

import java.util.Date;

public class DemoThread6 {
    public static void main(String[] args) throws Exception {
        // Task 1 using a lambda expression
        Runnable r1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task-1...." + new Date());
                try {
                    Thread.sleep(2000);  // Sleep for 2 seconds
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // Task 2 using a lambda expression
        Runnable r2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task-2...." + new Date());
                try {
                    Thread.sleep(2000);  // Sleep for 2 seconds
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating threads for both tasks
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start both threads
        t1.start();
        t2.start();

        // Optionally wait for both threads to finish execution
        t1.join();
        t2.join();  // Wait for t2 to complete before finishing main thread
    }
}
