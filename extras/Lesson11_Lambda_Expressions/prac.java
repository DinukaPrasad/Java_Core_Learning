package Lesson11_Lambda_Expressions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ============================================================
// Lambda with ExecutorService — Submitting Runnable Lambdas
// ============================================================
// Demonstrates:
//   - Using lambda expressions to define Runnable tasks inline
//   - Submitting lambdas to an ExecutorService thread pool
//   - Combining lambda concepts with concurrency
// ============================================================

public class prac {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Define tasks as lambda expressions (Runnable)
        Runnable task1 = () -> System.out.println("Task 1 is running in thread: " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Task 2 is running in thread: " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Task 3 is running in thread: " + Thread.currentThread().getName());

        // Submit all tasks to the thread pool
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();

    }
}
