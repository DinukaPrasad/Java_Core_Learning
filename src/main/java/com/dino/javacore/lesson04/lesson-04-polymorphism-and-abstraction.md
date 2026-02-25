# Lesson 04 — Polymorphism + Abstraction

## What You'll Learn
- Defining interfaces with a single-method contract
- Multiple classes implementing the same interface
- Polymorphic behavior — one method, many implementations
- Loose coupling via interface-based design

## Mini Explanation
**Polymorphism** means "many forms." You define an interface like `Notifiable`, and any class that `implements` it must provide its own version of `sendNotification()`. Then you can loop over a list of `Notifiable` objects and call the same method — each one responds differently. This is the foundation of scalable, extensible code.

## Practice Tasks
- [ ] Create a `Shape` interface with `double area()` and `String describe()`
- [ ] Implement `Circle`, `Rectangle`, and `Triangle`
- [ ] Write a method that takes `List<Shape>` and prints areas of all shapes
- [ ] Add an `abstract class` example alongside the interface

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson04.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson04/*.java
java -cp out com.dino.javacore.lesson04.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Notification system — interface, implementations, polymorphic dispatch |
