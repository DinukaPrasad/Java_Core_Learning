package Lesson10_Executor_Service_And_Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// ============================================================
// Callable Practice — Submitting Multiple Callable Tasks
// ============================================================
// Demonstrates:
//   - Creating a Callable<String> with lambda syntax
//   - Submitting the same task multiple times to the pool
//   - Blocking on future.get() to retrieve each result sequentially
// ============================================================

public class prac {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        // A Callable that simulates 2 seconds of work and returns a String
        Callable<String> task = () -> {
            Thread.sleep(2000); // Simulate work
            return "Hello from Callable!";
        };

        // Submit the task 10 times and print each result (blocking on get())
        for (int i = 0; i < 10; i++) {
            Future<String> future1 = pool.submit(task);
            System.out.println(future1.get()); // Blocks until this task completes
        }

        pool.shutdown();
    }
}
