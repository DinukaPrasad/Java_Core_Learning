# Lesson 07 — Sorting (Comparable / Comparator)

## What You'll Learn
- `Comparator.comparingInt()` for numeric sorting
- `.reversed()` for descending order
- `.thenComparing()` for secondary sort criteria
- `Comparator.comparing()` for String-based sorting
- When to use `Comparable` vs `Comparator`

## Mini Explanation
Java gives you two ways to sort objects. **Comparable** defines a *natural* order inside the class itself. **Comparator** defines *external* sort strategies — you can have many. Chain them with `.thenComparing()` for tie-breaking. Think of it like sorting a spreadsheet: first by grade (descending), then by name (alphabetically).

## Practice Tasks
- [ ] Make `Student` implement `Comparable<Student>` (sort by mark)
- [ ] Create 3 different `Comparator<Student>` instances (by name, by mark, by ID)
- [ ] Chain comparators: sort by mark descending, then by name ascending
- [ ] Sort a list of strings case-insensitively using `String.CASE_INSENSITIVE_ORDER`

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson07.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson07/*.java
java -cp out com.dino.javacore.lesson07.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Sorting demos with Comparator chains |
| `Student.java` | Immutable POJO used for sorting examples |
