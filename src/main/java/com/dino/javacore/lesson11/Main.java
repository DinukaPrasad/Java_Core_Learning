package com.dino.javacore.lesson11;

// ============================================================
// Lesson 11 — Exception Best Practices
// ============================================================
// Demonstrates:
//   - Custom exception with meaningful domain context
//   - Using try-catch for graceful error handling
//   - Throwing IllegalArgumentException for business rule violations
//   - Rethrowing / wrapping exceptions
//   - Best practices: specific exceptions, meaningful messages
// ============================================================

public class Main {

    public static void main(String[] args) {

        // --- Practice: Bank withdrawal with custom exception ---
        System.out.println("=== Withdrawal Scenarios ===");

        try {
            withdrawal(100, 500);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println();

        try {
            withdrawal(300, 200);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // --- Best practices demo ---
        System.out.println("\n=== Best Practices ===");

        // 1. Always catch the most specific exception first
        try {
            riskyOperation(null);
        } catch (NullPointerException e) {
            System.out.println("Specific catch (NPE): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic catch: " + e.getMessage());
        }

        // 2. Use try-with-resources for auto-closeable resources
        // (AutoCloseable example — no actual file I/O needed)
        System.out.println("\nTry-with-resources demo:");
        try (AutoCloseableDemo resource = new AutoCloseableDemo()) {
            resource.doWork();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Withdrawal method using custom exception
    public static void withdrawal(int amount, int balance) {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Cannot withdraw " + amount + " — balance is only " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful. Remaining: " + balance);
    }

    // Method that demonstrates catching specific exceptions
    static void riskyOperation(String input) {
        if (input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        System.out.println(input.toUpperCase());
    }
}

// Simple AutoCloseable demo for try-with-resources
class AutoCloseableDemo implements AutoCloseable {

    public void doWork() {
        System.out.println("  Working with resource...");
    }

    @Override
    public void close() {
        System.out.println("  Resource auto-closed!");
    }
}
