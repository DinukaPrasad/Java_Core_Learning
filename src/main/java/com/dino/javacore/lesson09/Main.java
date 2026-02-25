package com.dino.javacore.lesson09;

// ============================================================
// Lesson 09 — try / catch / finally
// ============================================================
// Demonstrates:
//   - Catching ArithmeticException (division by zero)
//   - Catching NumberFormatException (invalid number parsing)
//   - The finally block — always executes regardless of exception
//   - Multiple catch blocks for different exception types
// ============================================================

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Normal division ===");
        division(10, 2);

        System.out.println("\n=== Division by zero ===");
        division(10, 0);

        System.out.println("\n=== Number format error ===");
        parseAndDivide(10, "abc");
    }

    // Safe division method with exception handler and finally block
    static int division(int a, int b) {
        try {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("finally block executed");
        }
    }

    // Demonstrates NumberFormatException handling
    static int parseAndDivide(int a, String bStr) {
        try {
            int b = Integer.parseInt(bStr);
            return a / b;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            return 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("finally block executed");
        }
    }
}
