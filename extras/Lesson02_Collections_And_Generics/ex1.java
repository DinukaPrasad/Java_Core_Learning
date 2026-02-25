package Lesson02_Collections_And_Generics;

import java.util.List;

// ============================================================
// Collections & Generics — List, Set, Map + Iteration
// ============================================================
// Demonstrates:
//   - ArrayList, HashSet, HashMap usage (commented examples)
//   - Immutable list with List.of()
//   - Iterating with traditional for-loop vs enhanced for-each
//   - Generic method signature: <T> void printList(List<T>)
// ============================================================

public class ex1 {

    public static void main(String[] args) {

        // --- Commented-out examples showcasing List, Set, and Map ---
        // List<String> students = new ArrayList<>();

        // students.add("John");
        // students.add("Jane");
        // students.add("John"); // Duplicate entry
        // System.out.println("Students: " + students);

        // Set<String> uniqueStudents = new HashSet<>(students);
        // System.out.println("Unique Students: " + uniqueStudents);

        // Map<String, Integer> studentGrades = new HashMap<>();
        // studentGrades.put("John", 85);
        // studentGrades.put("Jane", 90);
        // System.out.println("Student Grades: " + studentGrades);

        // Create an immutable list using List.of()
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Compare two iteration approaches
        sumWithForLoop(numbers);
        sumWithForEachLoop(numbers);
    }

    // Traditional for-loop — index-based iteration
    public static void sumWithForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        System.out.println("Sum: " + sum);
    }

    // Enhanced for-each loop — cleaner syntax, no index needed
    public static void sumWithForEachLoop(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    // Generic method — can accept a List of any type <T>
    public <T> void printList(List<T> list) {

    }

}
