# Lesson 19 — Stack vs Heap

## What You'll Learn
- Primitive variables and references live on the **Stack** (per thread)
- Objects live on the **Heap** (shared, garbage collected)
- Each method call creates a new stack frame
- `StackOverflowError` from deep/infinite recursion
- Pass-by-value semantics for references

## Mini Explanation
The **Stack** is fast, thread-local memory for method calls. Every time you call a method, a new frame is pushed; when it returns, the frame is popped. The **Heap** is shared memory where objects live. A variable `Person p` on the stack holds a *reference* (pointer) to the actual `Person` object on the heap.

## Practice Tasks
- [ ] Draw a memory diagram for a method that creates 2 objects and 3 primitives
- [ ] Trigger `StackOverflowError` with infinite recursion, then add a base case
- [ ] Demonstrate that reassigning a reference inside a method doesn't affect the caller
- [ ] Explain why `String` is immutable and how it relates to the heap

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.dino.javacore.lesson19.Main"

# Or with javac/java
javac -d out src/main/java/com/dino/javacore/lesson19/*.java
java -cp out com.dino.javacore.lesson19.Main
```

## Key Files
| File | Description |
|------|-------------|
| `Main.java` | Stack/heap demos, pass-by-value, StackOverflowError |
