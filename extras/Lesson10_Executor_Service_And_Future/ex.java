package Lesson10_Executor_Service_And_Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ============================================================
// ExecutorService Basics — Fixed Thread Pool
// ============================================================
// Demonstrates:
//   - Creating a thread pool with Executors.newFixedThreadPool()
//   - Submitting multiple tasks to be distributed across pool threads
//   - pool.shutdown() — stops accepting new tasks, finishes queued ones
//   - Effectively-final variables required for lambda captures
// ============================================================

public class ex {
    public static void main(String[] args) {
        // Create a pool with 3 worker threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Submit 10 tasks — the pool distributes them across 3 threads
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i; // must be effectively final for lambda
            pool.submit(() -> {
                System.out.println(
                        Thread.currentThread().getName() + " is running task " + taskNumber);
            });
        }

        pool.shutdown(); // ✅ stop accepting new tasks
        System.out.println("Manager: submitted all tasks, shutting down pool...");
    }
}