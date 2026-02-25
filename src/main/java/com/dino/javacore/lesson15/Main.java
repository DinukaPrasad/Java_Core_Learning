package com.dino.javacore.lesson15;

import java.util.ArrayList;
import java.util.List;

// ============================================================
// Lesson 15 — Lambda Expressions
// ============================================================
// Demonstrates:
//   - @FunctionalInterface — an interface with exactly one abstract method
//   - Lambda syntax: (params) -> expression
//   - Method reference syntax: ClassName::methodName
//   - Assigning different lambda implementations to the same interface
// ============================================================

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Lambda Calculator ===");
        calculatorDemo();

        System.out.println("\n=== Method References ===");
        methodReferenceDemo();
    }

    // Demo 1: Functional interface with lambda implementations
    static void calculatorDemo() {
        // Define a functional interface locally
        @FunctionalInterface
        interface Calculator {
            int calculate(int a, int b);
        }

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        int x = 10, y = 5;
        System.out.println("Add:      " + add.calculate(x, y));
        System.out.println("Subtract: " + subtract.calculate(x, y));
        System.out.println("Multiply: " + multiply.calculate(x, y));
        System.out.println("Divide:   " + divide.calculate(x, y));
    }

    // Demo 2: Method references as shorthand for lambdas
    static void methodReferenceDemo() {
        List<String> items = new ArrayList<>(List.of("Banana", "Apple", "Cherry"));

        // Method reference: String::compareTo replaces (a, b) -> a.compareTo(b)
        items.sort(String::compareTo);
        System.out.println("Sorted: " + items);

        // Method reference: System.out::println replaces s -> System.out.println(s)
        items.forEach(System.out::println);
    }
}
