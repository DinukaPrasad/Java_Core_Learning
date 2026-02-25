# Lesson 21 — Memory Leaks

## What You'll Learn
- Unbounded collections that grow forever
- Static collections holding stale references
- Listener/callback leaks (register without unregister)
- Cache without eviction policy
- How to detect and prevent memory leaks

## Mini Explanation
Even with GC, Java can have **memory leaks** — objects that are technically reachable (so GC won't collect them) but logically useless. A static `List` that only grows, a cache that never evicts old entries, or event listeners that are registered but never removed are classic patterns. The fix: bound your collections, clear unused references, and profile regularly.

## Practice Tasks
- [ ] Create an unbounded event log, then fix it with a max-size check
- [ ] Replace `HashMap` cache with `WeakHashMap` and observe auto-eviction
- [ ] Write a listener registration/unregistration pattern
- [ ] Use `Runtime.getRuntime().totalMemory()` / `freeMemory()` to monitor usage
- [ ] Research: How does `VisualVM` or `jmap` help find leaks?

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson21.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson21/*.java
java -cp out com.dino.javacore.lesson21.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | 3 leak patterns: unbounded collection, cache, listener leak |
