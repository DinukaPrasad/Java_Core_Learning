package com.dino.javacore.lesson06;

import java.util.List;

// ============================================================
// Lesson 06 — Iteration + Generics
// ============================================================
// Demonstrates:
//   - Immutable list with List.of()
//   - Traditional for-loop (index-based iteration)
//   - Enhanced for-each loop
//   - Generic method signature: <T> void printList(List<T>)
// ============================================================

public class Main {

    public static void main(String[] args) {

        // Create an immutable list using List.of()
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Compare two iteration approaches
        System.out.println("=== Traditional for-loop ===");
        sumWithForLoop(numbers);

        System.out.println("\n=== Enhanced for-each loop ===");
        sumWithForEachLoop(numbers);

        // Demonstrate the generic printList method
        System.out.println("\n=== Generic printList (Integer) ===");
        printList(numbers);

        System.out.println("\n=== Generic printList (String) ===");
        List<String> names = List.of("Alice", "Bob", "Charlie");
        printList(names);
    }

    // Traditional for-loop — index-based iteration
    public static void sumWithForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum (for-loop): " + sum);
    }

    // Enhanced for-each loop — cleaner syntax, no index needed
    public static void sumWithForEachLoop(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum (for-each): " + sum);
    }

    // Generic method — can accept a List of any type <T>
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println("  → " + item);
        }
    }
}
