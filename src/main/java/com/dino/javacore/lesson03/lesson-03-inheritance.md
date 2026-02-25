# Lesson 03 — Inheritance

## What You'll Learn
- Creating a base/parent class with shared properties
- Extending a class with the `extends` keyword
- Inheriting fields and methods from the parent
- Overriding methods with `@Override`
- Using `super()` to call parent constructors

## Mini Explanation
**Inheritance** is the "is-a" relationship. A `Student` **is a** `Person`, so it inherits all of `Person`'s fields and methods. Instead of copy-pasting code, you write common behavior once in the parent and extend it in the child. You can override methods to customize behavior in the child class.

## Practice Tasks
- [ ] Create a `Vehicle` base class with `make`, `model`, `year`
- [ ] Create `Car` and `Truck` subclasses with extra fields
- [ ] Override `toString()` in each subclass
- [ ] Create a `printVehicleInfo(Vehicle v)` method that works with any vehicle

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson03.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson03/*.java
java -cp out com.dino.javacore.lesson03.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Demo — creates Person and Student objects |
| `Person.java` | Base class with name, email |
| `Student.java` | Child class extending Person with studentId, major |
