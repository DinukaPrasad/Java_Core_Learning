# Lesson 08 — Performance Intuition

## What You'll Learn
- `ArrayList` search is O(n) — linear scan
- `HashMap` lookup is O(1) — constant time
- Measuring execution time with `System.nanoTime()`
- Why data structure choice matters for performance

## Mini Explanation
Not all collections are equal. Searching a `List` for element #999 means checking up to 999 items one by one. Searching a `Map` with `map.get(999)` jumps directly to the answer using hashing. This lesson benchmarks both so you can *see* the difference. The right data structure can turn a slow program into a fast one.

## Practice Tasks
- [ ] Increase the collection size to 1,000,000 and re-run the benchmark
- [ ] Add a `LinkedList` benchmark alongside `ArrayList`
- [ ] Benchmark `HashSet.contains()` vs `ArrayList.contains()`
- [ ] Plot results (optional): record times for sizes 100, 1K, 10K, 100K, 1M

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson08.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson08/*.java
java -cp out com.dino.javacore.lesson08.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | List vs Map search benchmark |
| `Student.java` | Simple POJO used in the benchmark |
