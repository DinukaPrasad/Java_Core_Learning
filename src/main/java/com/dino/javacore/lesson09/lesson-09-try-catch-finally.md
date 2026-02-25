# Lesson 09 — try / catch / finally

## What You'll Learn
- Catching `ArithmeticException` (division by zero)
- Catching `NumberFormatException` (invalid parsing)
- The `finally` block — always executes
- Multiple `catch` blocks for different exception types

## Mini Explanation
When something goes wrong at runtime, Java throws an **exception**. Without handling it, your program crashes. The `try/catch` block lets you intercept errors gracefully. The `finally` block always runs — whether an exception occurred or not — making it perfect for cleanup code (closing files, releasing resources).

## Practice Tasks
- [ ] Write a method that parses user input and handles `NumberFormatException`
- [ ] Write a method with nested `try-catch` blocks
- [ ] Demonstrate that `finally` runs even when `return` is inside `try`
- [ ] Catch `Exception` as a fallback after specific catches

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson09.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson09/*.java
java -cp out com.dino.javacore.lesson09.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Exception handling demos with try/catch/finally |
