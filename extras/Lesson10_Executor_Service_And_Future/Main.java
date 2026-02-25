package Lesson10_Executor_Service_And_Future;

import java.util.concurrent.*;

// ============================================================
// Future & Callable — Getting Results from Async Tasks
// ============================================================
// Demonstrates:
//   - Callable<T> — a task that returns a value (unlike Runnable)
//   - Future<T>.get() — blocks until the result is available
//   - Submitting a Callable to ExecutorService
//   - Performing other work while the async task runs
// ============================================================

public class Main {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a Callable that sleeps for 2 seconds, then returns 42
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(2000);
            return 42;
        });

        // Main thread continues other work while the callable runs
        System.out.println("Doing other work...");

        // future.get() blocks here until the Callable completes
        Integer result = future.get(); // waits until done

        System.out.println("Result: " + result);

        executor.shutdown();
    }
}
