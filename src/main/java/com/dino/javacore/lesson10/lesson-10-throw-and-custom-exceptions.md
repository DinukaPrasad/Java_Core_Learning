# Lesson 10 — throw + Custom Exceptions

## What You'll Learn
- Creating a custom exception class extending `RuntimeException`
- Throwing custom exceptions with `throw new`
- Validation logic that triggers custom exceptions
- Catching custom exceptions with `try-catch`

## Mini Explanation
Sometimes built-in exceptions aren't descriptive enough. You can create your own by extending `RuntimeException` (unchecked) or `Exception` (checked). This lesson creates an `InvalidEmailException` that's thrown whenever email validation fails inside the `User` class. Domain-specific exceptions make debugging much easier.

## Practice Tasks
- [ ] Create `InvalidAgeException` that extends `RuntimeException`
- [ ] Throw it from a `Person` constructor when age < 0 or > 150
- [ ] Create a checked exception (extends `Exception`) and handle it with `throws`
- [ ] Add an error code or enum field to your custom exception

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson10.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson10/*.java
java -cp out com.dino.javacore.lesson10.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Demo — creates Users with valid/invalid emails |
| `InvalidEmailException.java` | Custom RuntimeException |
| `User.java` | User class with email validation |
