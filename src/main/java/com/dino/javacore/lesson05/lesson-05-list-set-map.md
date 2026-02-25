# Lesson 05 — List, Set, Map

## What You'll Learn
- `ArrayList` — ordered collection, allows duplicates
- `HashSet` — unordered, no duplicates
- `HashMap` — key-value pairs with fast lookup
- Converting between collection types
- Checking existence with `containsKey()` / `containsValue()`

## Mini Explanation
Java's Collections Framework gives you three core data structures. **List** is like a numbered shelf (ordered, allows repeats). **Set** is like a bag of unique marbles (no duplicates). **Map** is like a dictionary (key → value). Choosing the right one is half the battle in writing efficient code.

## Practice Tasks
- [ ] Create an `ArrayList<String>` of cities, add duplicates, print size
- [ ] Convert the list to a `HashSet` — observe duplicate removal
- [ ] Create a `HashMap<String, Integer>` for student grades
- [ ] Iterate over the map using `entrySet()`
- [ ] Use `getOrDefault()` for safe map lookups

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson05.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson05/*.java
java -cp out com.dino.javacore.lesson05.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Demonstrates ArrayList, HashSet, HashMap with examples |
