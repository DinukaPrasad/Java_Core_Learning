# Lesson 02 — Encapsulation

## What You'll Learn
- Private fields (data hiding)
- Public getters and setters (controlled access)
- Input validation inside setters
- Why encapsulation makes code safer

## Mini Explanation
**Encapsulation** is like putting your data in a safe with a combination lock. The fields are `private` (hidden), and the only way to read or modify them is through `public` getter/setter methods. This lets you add validation — for example, rejecting an invalid email before it corrupts your data.

## Practice Tasks
- [ ] Create a `BankAccount` class with `private` fields: `accountNumber`, `balance`
- [ ] Add a `deposit(double amount)` setter that rejects negative amounts
- [ ] Add a `withdraw(double amount)` method that rejects overdrafts
- [ ] Test with valid and invalid inputs

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson02.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson02/*.java
java -cp out com.dino.javacore.lesson02.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Demo — creates Student, tests setter validation |
| `Student.java` | Encapsulated class with private fields + validated setters |
