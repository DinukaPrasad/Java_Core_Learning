package com.dino.javacore.lesson12;

// ============================================================
// Lesson 12 — Threads & Runnable
// ============================================================
// Demonstrates:
//   - Creating threads using Runnable (lambda syntax)
//   - Naming threads via the Thread constructor
//   - Concurrent execution — two threads running in parallel
//   - Thread.sleep() to simulate work
//   - InterruptedException handling
// ============================================================

public class Main {

    public static void main(String[] args) {

        // Task 1: Simulate cooking eggs in 5 steps
        Runnable cookEggs = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ": Cooking eggs... step " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Task 2: Simulate making tea in 5 steps
        Runnable makeTea = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ": Making tea... step " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Create two threads with custom names and start them concurrently
        Thread chefA = new Thread(cookEggs, "Chef-A");
        Thread chefB = new Thread(makeTea, "Chef-B");

        chefA.start();
        chefB.start();

        // This prints from the main thread — may appear before/after/between
        // thread output
        System.out.println("Manager: Orders are being prepared!");
    }
}
