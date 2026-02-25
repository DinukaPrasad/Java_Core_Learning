# Lesson 18 — Stream Pitfalls

## What You'll Learn
- A stream can only be consumed **once**
- Streams are **lazy** — no terminal op means no execution
- Avoid side-effects in intermediate operations
- `parallelStream()` isn't always faster (overhead for small data)

## Mini Explanation
Streams are powerful but have gotchas. Reusing a consumed stream throws `IllegalStateException`. Forgetting a terminal operation means your pipeline silently does nothing. Mutating external state inside `map`/`filter` leads to bugs. And `parallelStream()` has thread-coordination overhead that only pays off for large datasets.

## Practice Tasks
- [ ] Trigger `IllegalStateException` by reusing a stream, then fix it
- [ ] Write a lazy stream pipeline and add `.toList()` to make it execute
- [ ] Refactor a side-effect-heavy stream to use proper collectors
- [ ] Benchmark `stream()` vs `parallelStream()` for 1M elements

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson18.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson18/*.java
java -cp out com.dino.javacore.lesson18.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Demonstrates 4 common stream pitfalls with examples |
