package Lesson11_Lambda_Expressions;

import java.util.List;
import java.util.ArrayList;

// ============================================================
// Method References — Shorthand for Lambda Expressions
// ============================================================
// Demonstrates:
//   - Method reference syntax:  ClassName::methodName
//   - String::compareTo as a replacement for (a, b) -> a.compareTo(b)
//   - Sorting a list of strings using method reference
// ============================================================

public class ex2 {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(List.of("5", "2", "8", "1", "9"));

        // Lambda version (commented out):
        // numbers.sort((a, b) -> a.compareTo(b));

        // Equivalent method reference — cleaner and more readable
        numbers.sort(String::compareTo);

        System.out.println("Sorted numbers: " + numbers);
    }
}
