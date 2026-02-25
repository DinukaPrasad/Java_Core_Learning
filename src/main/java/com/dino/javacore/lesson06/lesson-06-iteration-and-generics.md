# Lesson 06 — Iteration + Generics

## What You'll Learn
- Traditional `for` loop (index-based iteration)
- Enhanced `for-each` loop
- `List.of()` for immutable lists
- Generic methods: `<T> void printList(List<T>)`
- Type safety with generics

## Mini Explanation
**Iteration** is how you walk through a collection. The old `for(int i=0; ...)` gives you the index; the `for-each` loop is cleaner when you don't need it. **Generics** let you write one method that works with `List<Integer>`, `List<String>`, or `List<anything>` — without casting and with compile-time type safety.

## Practice Tasks
- [ ] Write a generic method `<T> T findFirst(List<T> list)` that returns the first element
- [ ] Write a generic method `<T> List<T> reverse(List<T> list)`
- [ ] Compare `for-loop` vs `for-each` performance on a large list (1M elements)
- [ ] Use `Iterator` explicitly to remove elements during iteration

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson06.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson06/*.java
java -cp out com.dino.javacore.lesson06.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Iteration demos + generic printList method |
