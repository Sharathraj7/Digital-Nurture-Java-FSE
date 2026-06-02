// Custom thread class that extends Thread
// 26. Thread Creation 
// • Objective: Implement multithreading. 
// • Task: Create and run two threads that print messages. 
// • Instructions: 
// o Define a class that extends Thread or implements Runnable. 
// o In the run() method, print a message multiple times. 
// o Start both threads and observe the output.
class MyThread extends Thread {
    private String threadName;
    
    // Constructor
    public MyThread(String name) {
        this.threadName = name;
    }
    
    // Override run() method
    @Override
    public void run() {
        System.out.println(threadName + " started");
        
        // Print message multiple times
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running - Count: " + i);
            try {
                // Sleep for a short time to allow thread switching
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted!");
            }
        }
        
        System.out.println(threadName + " finished");
    }
}

public class Threadcreation {
    public static void main(String[] args) {
        System.out.println("=== Thread Creation Example ===\n");
        System.out.println("Main thread started\n");
        
        // Create two thread instances
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        // Start both threads
        thread1.start();
        thread2.start();
        
        // Main thread continues
        System.out.println("Both threads have been started\n");
        
        // Optional: Wait for threads to complete
        try {
            thread1.join();  // Wait for thread1 to complete
            thread2.join();  // Wait for thread2 to complete
            System.out.println("\nAll threads have completed");
            System.out.println("Main thread finished");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted!");
        }
    }
}
