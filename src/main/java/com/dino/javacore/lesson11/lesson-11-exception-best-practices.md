# Lesson 11 — Exception Best Practices

## What You'll Learn
- Always catch the most specific exception first
- Use `try-with-resources` for `AutoCloseable` objects
- Meaningful custom exceptions for business domains
- When to use checked vs unchecked exceptions
- Avoid swallowing exceptions (empty catch blocks)

## Mini Explanation
Knowing `try/catch` syntax isn't enough — you need to use it *well*. Catch specific exceptions before generic ones. Use `try-with-resources` so files and connections auto-close. Create domain-specific exceptions (like `InsufficientFundsException`) instead of reusing generic ones. Never write an empty `catch` block — at minimum, log the error.

## Practice Tasks
- [ ] Refactor a method with a generic `catch(Exception e)` to use specific catches
- [ ] Write a `try-with-resources` example that reads a file
- [ ] Create a custom exception hierarchy: `AppException` → `ValidationException` → `InvalidFieldException`
- [ ] Demonstrate exception chaining with `new CustomException("msg", cause)`

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson11.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson11/*.java
java -cp out com.dino.javacore.lesson11.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Best practices demo — specific catches, try-with-resources, bank withdrawal |
| `InsufficientFundsException.java` | Custom exception for banking scenarios |
