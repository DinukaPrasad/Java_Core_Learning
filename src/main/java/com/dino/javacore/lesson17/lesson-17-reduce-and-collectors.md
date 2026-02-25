# Lesson 17 — reduce + Grouping Collectors

## What You'll Learn
- `mapToInt().sum()` — summing primitive values
- `Collectors.groupingBy()` — grouping elements by a classifier
- `Collectors.averagingInt()` — computing average per group
- `Collectors.mapping()` / `Collectors.counting()` — downstream collectors
- Stream vs traditional loop comparison

## Mini Explanation
**Collectors** are the Swiss army knife of terminal operations. `groupingBy` splits data into buckets (like SQL's GROUP BY). You can chain downstream collectors to compute averages, counts, or transform values within each group. `reduce` lets you fold a stream into a single result.

## Practice Tasks
- [ ] Use `Collectors.partitioningBy()` to split students into pass/fail
- [ ] Use `Collectors.joining(", ")` to concatenate names
- [ ] Use `stream().reduce(0, Integer::sum)` to sum a list
- [ ] Group employees by department, then find max salary per department

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson17.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson17/*.java
java -cp out com.dino.javacore.lesson17.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Collectors demos: groupingBy, averagingInt, counting, mapping |
| `Student.java` | Model with programme field for grouping |
