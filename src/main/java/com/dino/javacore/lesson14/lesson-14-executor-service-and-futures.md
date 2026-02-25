# Lesson 14 — ExecutorService / Futures

## What You'll Learn
- Creating a thread pool with `Executors.newFixedThreadPool()`
- Submitting `Runnable` tasks to the pool
- `Callable<T>` — a task that returns a value
- `Future<T>.get()` — blocking until the result is available
- Proper shutdown pattern with `awaitTermination()`

## Mini Explanation
Creating raw `Thread` objects for every task is wasteful. An **ExecutorService** manages a pool of reusable threads. You submit tasks, and the pool assigns them to available threads. For tasks that return results, use `Callable` + `Future`. Always shut down the pool properly to avoid resource leaks.

## Practice Tasks
- [ ] Submit 20 tasks to a pool of 4 threads — observe thread reuse
- [ ] Submit 5 `Callable<Integer>` tasks and sum all their results
- [ ] Use `Future.isDone()` and `Future.cancel()` to manage task lifecycle
- [ ] Replace `Executors.newFixedThreadPool` with `newCachedThreadPool` and compare

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson14.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson14/*.java
java -cp out com.dino.javacore.lesson14.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Runnable pool demo, Callable/Future demo, proper shutdown pattern |
