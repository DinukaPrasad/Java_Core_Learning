# Lesson 12 — Threads & Runnable

## What You'll Learn
- Creating threads using `Runnable` (lambda syntax)
- Naming threads via the `Thread` constructor
- Starting concurrent execution with `.start()`
- `Thread.sleep()` to simulate work
- `InterruptedException` handling

## Mini Explanation
A **thread** is like hiring a second cook in the kitchen. While Chef A cooks eggs, Chef B makes tea — both work at the same time. Java's `Thread` class takes a `Runnable` (a task) and runs it concurrently. The order of output is non-deterministic — threads interleave unpredictably.

## Practice Tasks
- [ ] Create 3 threads that print numbers 1–10 with different sleep intervals
- [ ] Use `Thread.join()` to wait for all threads before printing "Done"
- [ ] Create a thread by extending `Thread` (alternative to `Runnable`)
- [ ] Demonstrate `thread.interrupt()` to cancel a sleeping thread

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson12.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson12/*.java
java -cp out com.dino.javacore.lesson12.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Two concurrent threads — cooking eggs and making tea |
