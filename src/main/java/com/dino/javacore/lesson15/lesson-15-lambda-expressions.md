# Lesson 15 — Lambda Expressions

## What You'll Learn
- `@FunctionalInterface` — an interface with exactly one abstract method
- Lambda syntax: `(params) -> expression`
- Method references: `ClassName::methodName`
- Assigning different lambda implementations to the same interface type

## Mini Explanation
**Lambdas** are anonymous functions you can pass around like data. Instead of writing a whole class just to implement one method, you write `(a, b) -> a + b`. **Method references** are even shorter: `String::compareTo` instead of `(a, b) -> a.compareTo(b)`. Together they make Java code dramatically more concise.

## Practice Tasks
- [ ] Create a `Predicate<String>` lambda that checks if a string starts with "A"
- [ ] Create a `Function<String, Integer>` that returns string length
- [ ] Use `Consumer<String>` to print strings with a prefix
- [ ] Refactor an anonymous class to a lambda expression

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson15.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson15/*.java
java -cp out com.dino.javacore.lesson15.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Lambda calculator demo + method reference sorting demo |
