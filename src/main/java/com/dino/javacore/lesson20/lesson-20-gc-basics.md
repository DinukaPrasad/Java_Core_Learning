# Lesson 20 — GC Basics

## What You'll Learn
- Objects become eligible for GC when no references point to them
- `System.gc()` is a hint (not a guarantee)
- JVM flags: `-Xmx` (max heap), `-Xms` (initial heap), `-verbose:gc`
- Strong references vs unreachable objects
- Reference lifecycle: create → use → unreachable → collected

## Mini Explanation
Java's **Garbage Collector** automatically frees heap memory by removing objects that are no longer reachable. You don't call `free()` or `delete` — the GC does it for you. But you need to understand *when* objects become eligible: setting a reference to `null` or letting it go out of scope makes the object unreachable.

## Practice Tasks
- [ ] Create 1000 objects in a loop and observe memory before/after `System.gc()`
- [ ] Run with `-verbose:gc` flag and read the GC log output
- [ ] Demonstrate that `System.gc()` doesn't guarantee immediate collection
- [ ] Experiment with `-Xmx32m` to trigger `OutOfMemoryError`

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson20.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson20/*.java
java -cp out com.dino.javacore.lesson20.Main

# With GC logging:
java -verbose:gc -cp out com.dino.javacore.lesson20.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | GC demos: temporary objects, reference lifecycle, System.gc() |
