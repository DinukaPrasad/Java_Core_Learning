package com.dino.javacore.lesson19;

// ============================================================
// Lesson 19 — Stack vs Heap
// ============================================================
// Demonstrates:
//   - Primitive variables live on the STACK (fast, thread-local)
//   - Objects live on the HEAP (shared, garbage collected)
//   - Each thread has its own stack
//   - Method-local variables go on the stack frame
//   - Reference variables on the stack point to objects on the heap
// ============================================================

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Stack vs Heap Demo ===\n");

        // --- Primitives on the stack ---
        int x = 10; // 'x' is stored on the stack
        int y = 20; // 'y' is stored on the stack
        int sum = add(x, y); // 'sum' is on the stack; add() creates its own stack frame
        System.out.println("Sum (primitives on stack): " + sum);

        // --- Objects on the heap ---
        Person p = new Person("Alice", 30);
        // 'p' (the reference) is on the stack.
        // The Person object {"Alice", 30} is on the heap.
        System.out.println("Person (object on heap): " + p);

        // --- Demonstrating pass-by-value for references ---
        System.out.println("\nBefore birthday: " + p);
        celebrateBirthday(p); // passes the reference by value
        System.out.println("After birthday:  " + p);

        // --- Stack overflow demo ---
        System.out.println("\n=== Stack Overflow Demo ===");
        try {
            recursiveMethod(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError! Too many stack frames.");
        }

        // --- Memory layout summary ---
        System.out.println("\n=== Memory Layout Summary ===");
        System.out.println("STACK: primitives, local variables, method frames (per thread)");
        System.out.println("HEAP:  objects, arrays, class instances (shared, GC managed)");
    }

    static int add(int a, int b) {
        // a, b, and result are on add()'s stack frame
        int result = a + b;
        return result;
        // when add() returns, its stack frame is popped
    }

    static void celebrateBirthday(Person person) {
        // 'person' is a copy of the reference — same heap object
        person.setAge(person.getAge() + 1);
    }

    static void recursiveMethod(int depth) {
        // Each call adds a new stack frame → eventually overflows
        recursiveMethod(depth + 1);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (age " + age + ")";
    }
}
