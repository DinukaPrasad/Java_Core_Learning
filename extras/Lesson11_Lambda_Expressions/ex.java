package Lesson11_Lambda_Expressions;

// ============================================================
// Lambda Expressions — Functional Interface & Calculator
// ============================================================
// Demonstrates:
//   - @FunctionalInterface — an interface with exactly one abstract method
//   - Lambda syntax: (params) -> expression
//   - Assigning different lambda implementations to the same interface
//   - Using lambdas to replace verbose anonymous inner classes
// ============================================================

public class ex {
    public static void main(String[] args) {

        // Define a functional interface inside the method (local interface)
        @FunctionalInterface
        interface Calculator {
            int calculate(int a, int b);

        }

        // Lambda implementations for four basic arithmetic operations
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        int num1 = 10;
        int num2 = 5;

        // Call each lambda through the same interface method
        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + subtract.calculate(num1, num2));
        System.out.println("Multiplication: " + multiply.calculate(num1, num2));
        System.out.println("Division: " + divide.calculate(num1, num2));
    }
}
