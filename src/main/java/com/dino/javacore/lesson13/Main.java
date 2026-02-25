package com.dino.javacore.lesson13;

import java.util.concurrent.atomic.AtomicInteger;

// ============================================================
// Lesson 13 — Synchronization / Race Conditions
// ============================================================
// Demonstrates:
//   - Race condition: two threads incrementing a shared counter
//   - synchronized block to make the critical section thread-safe
//   - AtomicInteger as a lock-free alternative
//   - Thread.join() to wait for threads before reading result
// ============================================================

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== synchronized block demo ===");
        synchronizedDemo();

        System.out.println("\n=== AtomicInteger demo ===");
        atomicDemo();
    }

    // Demo 1: Using synchronized block
    static void synchronizedDemo() throws InterruptedException {
        SyncCounter counter = new SyncCounter();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: " + (2 * 100_000));
        System.out.println("Actual:   " + counter.getCount());
    }

    // Demo 2: Using AtomicInteger (lock-free)
    static void atomicDemo() throws InterruptedException {
        AtomicInteger atomicCount = new AtomicInteger(0);

        Runnable task = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                atomicCount.incrementAndGet();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: " + (2 * 1_000_000));
        System.out.println("Actual:   " + atomicCount.get());
    }
}

// Shared counter with synchronized increment to prevent race conditions
class SyncCounter {

    private int count = 0;
    private final Object lock = new Object();

    void increment() {
        synchronized (lock) {
            count++;
        }
    }

    int getCount() {
        return count;
    }
}
