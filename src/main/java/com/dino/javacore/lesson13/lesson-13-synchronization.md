# Lesson 13 — Synchronization / Race Conditions

## What You'll Learn
- What a race condition is and why it's dangerous
- `synchronized` block to protect critical sections
- `AtomicInteger` as a lock-free alternative
- `Thread.join()` to wait for thread completion
- Comparing synchronized vs atomic approaches

## Mini Explanation
When two threads modify the same variable without protection, you get a **race condition** — the final value is unpredictable. The `synchronized` block acts like a lock: only one thread can enter at a time. `AtomicInteger` is a faster alternative using CPU-level atomic operations (CAS). Both guarantee correctness.

## Practice Tasks
- [ ] Remove `synchronized` and observe the race condition (actual < expected)
- [ ] Replace `synchronized` with `ReentrantLock`
- [ ] Benchmark `synchronized` vs `AtomicInteger` for 10M increments
- [ ] Create a thread-safe `BankAccount` class with `deposit` and `withdraw`

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson13.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson13/*.java
java -cp out com.dino.javacore.lesson13.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | synchronized block demo + AtomicInteger demo |
