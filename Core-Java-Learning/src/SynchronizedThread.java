class Counter {
    int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedThread {  // Renamed class to follow Java naming convention
    public static void main(String[] args) throws InterruptedException {  // Added main method
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        // Create threads
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start threads
        t1.start();
        t2.start();

        // Wait for threads to finish
        t1.join();
        t2.join();

        // Output the final count (should be 200 if no race conditions)
        System.out.println("Final count: " + c.getCount());
    }
}
