package Lesson09_Race_Condition_And_Synchronization;

import java.util.concurrent.atomic.AtomicInteger;

// ============================================================
// AtomicInteger Practice — Lock-Free Thread Safety
// ============================================================
// Demonstrates:
//   - AtomicInteger as an alternative to synchronized blocks
//   - incrementAndGet() — atomic compound operation
//   - Comparing synchronized vs AtomicInteger approaches
//   - Thread.join() for waiting on thread completion
// ============================================================

public class Practice {
    public static void main(String[] args) {

        counter c = new counter();

        // Each thread increments the atomic counter 1,000,000 times
        Runnable task = () -> {
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        };

        Thread workerA = new Thread(task);
        Thread workerB = new Thread(task);

        workerA.start();
        workerB.start();

        try {
            workerA.join();
            workerB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        // Expect 2,000,000 — AtomicInteger guarantees correctness
        System.out.println("Expected: " + (2 * 1000000));
        System.out.println("Actual:   " + c.atomicCount.get());

    }
}

// Counter class showcasing both synchronized and AtomicInteger approaches
class counter {
    int count = 0;
    final Object lock = new Object();
    AtomicInteger atomicCount = new AtomicInteger(0);

    void increment() {

        /// This is a critical section where the count variable is being modified.
        // System.err.println("Thread " + Thread.currentThread().getName()
        // + " is trying to increment count. Current count: " + count);
        // synchronized (lock) {
        // count++; // ✅ safe
        // }

        // System.err.println(Thread.currentThread().getName() + " incremented count to:
        // " + count);

        /// Using AtomicInteger to ensure thread safety without explicit synchronization
        atomicCount.incrementAndGet(); // ✅ safe

    }
}
