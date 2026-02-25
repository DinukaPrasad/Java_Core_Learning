package Lesson10_Executor_Service_And_Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ============================================================
// ExecutorService Demo 2 — Simulating Long-Running Tasks
// ============================================================
// Demonstrates:
//   - Thread pool reuse — 3 threads handling 10 tasks
//   - Thread.sleep() to simulate real work inside each task
//   - Observing task START and END to understand thread scheduling
// ============================================================

public class ExecutorsDemo2 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;

            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName()
                        + " START task " + taskNumber);

                try {
                    Thread.sleep(1000); // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(Thread.currentThread().getName()
                        + " END   task " + taskNumber);
            });
        }

        pool.shutdown();
        System.out.println("Manager: All tasks submitted.");
    }
}
