package com.dino.javacore.lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// ============================================================
// Lesson 14 — ExecutorService / Futures
// ============================================================
// Demonstrates:
//   - Creating a thread pool with Executors.newFixedThreadPool()
//   - Submitting Runnable tasks to the pool
//   - Callable<T> — a task that returns a value
//   - Future<T>.get() — blocking until the result is available
//   - Proper shutdown pattern with awaitTermination
// ============================================================

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("=== Fixed Thread Pool — Runnable tasks ===");
        runnableDemo();

        System.out.println("\n=== Future & Callable ===");
        callableDemo();

        System.out.println("\n=== Proper Shutdown Pattern ===");
        shutdownDemo();
    }

    // Demo 1: Submit Runnable tasks to a fixed pool
    static void runnableDemo() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            int taskNumber = i;
            pool.submit(() -> System.out.println(
                    Thread.currentThread().getName() + " → task " + taskNumber));
        }

        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
    }

    // Demo 2: Submit Callable and get result via Future
    static void callableDemo() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);
            return 42;
        });

        System.out.println("Doing other work while callable runs...");
        Integer result = future.get(); // blocks until done
        System.out.println("Callable result: " + result);

        executor.shutdown();
    }

    // Demo 3: Proper shutdown with awaitTermination + shutdownNow fallback
    static void shutdownDemo() {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        try {
            for (int i = 1; i <= 5; i++) {
                int taskNumber = i;
                pool.submit(() -> {
                    System.out.println(Thread.currentThread().getName()
                            + " running task " + taskNumber);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        } finally {
            pool.shutdown();
            try {
                if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                    pool.shutdownNow();
                    System.out.println("Pool forced shutdown!");
                } else {
                    System.out.println("All tasks completed gracefully.");
                }
            } catch (InterruptedException e) {
                pool.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
}
