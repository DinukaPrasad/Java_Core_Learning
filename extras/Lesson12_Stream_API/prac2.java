package Lesson12_Stream_API;

import java.util.List;

// ============================================================
// Stream Practice 2 — filter + map + forEach Terminal Operation
// ============================================================
// Demonstrates:
//   - Chaining filter → map → forEach in a single pipeline
//   - Method references: Student::toString, System.out::println
//   - Using forEach as a terminal operation for side-effects
// ============================================================

public class prac2 {
    public static void main(String[] args) {

        List<Student> students = List.of(new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 35),
                new Student("David", 49),
                new Student("Eve", 88));

        // Print all students who failed (mark < 50)
        students.stream().filter(s -> s.getMark() < 50).map(Student::toString).forEach(System.out::println);

        // System.out.println("Number of failed students: " + failedStudentsCount);
    }
}
