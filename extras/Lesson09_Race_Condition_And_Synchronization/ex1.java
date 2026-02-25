package Lesson09_Race_Condition_And_Synchronization;

// ============================================================
// Race Condition & Synchronization — Using synchronized Block
// ============================================================
// Demonstrates:
//   - Race condition: two threads incrementing a shared counter
//   - Without synchronization, the actual count < expected count
//   - Using synchronized(lock) {} to make the critical section thread-safe
//   - Thread.join() to wait for both threads to finish before reading result
// ============================================================

public class ex1 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Both threads share the same Counter and run 100,000 increments each
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        // Wait for both threads to complete before printing the result
        t1.join();
        t2.join();

        System.out.println("Expected: " + (2 * 100000));
        System.out.println("Actual:   " + c.count);
    }
}

// Shared counter with synchronized increment to prevent race conditions
class Counter {
    int count = 0;
    private Object lock = new Object();

    // synchronized block ensures only one thread can increment at a time
    void increment() {
        synchronized (lock) {
            count++; // ✅ safe
        }
    }
}
