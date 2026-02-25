# Lesson 16 — Stream Pipeline Operations

## What You'll Learn
- `.stream()` — converts a collection into a stream
- `.filter()` — keeps only elements matching a condition
- `.sorted()` — sorts using a custom comparator
- `.map()` — transforms each element
- `.toList()` / `.forEach()` — terminal operations

## Mini Explanation
A **Stream** is a pipeline of operations on data. Think of it like an assembly line: raw materials (data) flow through stations (filter → sort → map) and come out as finished products. Streams are *lazy* — nothing runs until a terminal operation (like `toList()`) triggers execution.

## Practice Tasks
- [ ] Filter a list of integers to keep only even numbers, then square them
- [ ] Chain `.filter().sorted().map().toList()` on a list of students
- [ ] Use `.findFirst()` and `.anyMatch()` as short-circuit terminal ops
- [ ] Convert a `List<String>` to uppercase using `.map(String::toUpperCase)`

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson16.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson16/*.java
java -cp out com.dino.javacore.lesson16.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Stream pipeline demos: filter, map, sorted, forEach |
| `Student.java` | Model class for stream examples |
