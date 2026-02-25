# Lesson 01 — Classes & Objects

## What You'll Learn
- How to define a class with fields and methods
- Creating objects using the `new` keyword
- Default vs parameterized constructors
- The `this` keyword
- Calling methods on object instances

## Mini Explanation
Everything in Java revolves around **classes** and **objects**. A class is the blueprint (like an architect's plan), and an object is the actual house built from it. You define fields (data) and methods (behavior) inside a class, then create instances to use them.

## Practice Tasks
- [ ] Create a `Book` class with `title`, `author`, and `pages` fields
- [ ] Add a default and a parameterized constructor
- [ ] Add a method `boolean isLong()` that returns `true` if pages > 300
- [ ] Create 3 `Book` objects and print their details
- [ ] Add a `toString()` override for clean printing

## How to Run
```bash
# From project root
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson01.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson01/*.java
java -cp out com.dino.javacore.lesson01.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Entry point — creates and uses Car objects |
| `Car.java` | Model class with fields, constructors, methods |
