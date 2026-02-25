package Lesson10_Executor_Service_And_Future;

import java.util.concurrent.*;

// ============================================================
// Proper ExecutorService Shutdown Pattern
// ============================================================
// Demonstrates:
//   - try/finally to guarantee shutdown is always called
//   - awaitTermination() — waits up to N seconds for tasks to finish
//   - shutdownNow() — forces immediate stop if tasks take too long
//   - Best practice for production-ready thread pool management
// ============================================================

public class ExecutorsShutdownProperly {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        try {
            for (int i = 1; i <= 10; i++) {
                int taskNumber = i;
                pool.submit(() -> {
                    System.out.println(Thread.currentThread().getName()
                            + " running task " + taskNumber);
                });
            }
        } finally {
            pool.shutdown(); // stop accepting new tasks
            try {
                // Wait up to 5 seconds for existing tasks to finish
                if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                    pool.shutdownNow(); // force stop if taking too long
                }
            } catch (InterruptedException e) {
                pool.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
}
