package Lesson13_Stream_Collectors;

import java.util.List;

// ============================================================
// Stream vs Loop — Comparing Approaches
// ============================================================
// Demonstrates:
//   - Stream approach: filter + map + forEach pipeline
//   - Traditional for-loop approach for the same logic
//   - Choosing between declarative (stream) vs imperative (loop)
// ============================================================

public class prac2 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Alice", 85, "CS"),
                new Student("Bob", 92, "Math"),
                new Student("Charlie", 35, "CS"),
                new Student("David", 49, "Math"),
                new Student("Eve", 88, "CS"));

        /// Stream approach: print names of all students who failed (mark < 50)
        students.stream().filter(s -> s.getMark() < 50).map(Student::getName).forEach(System.out::println);

        /// Traditional for-loop approach: same logic with explicit iteration
        for (Student s : students) {
            if (s.getMark() < 50) {
                System.out.println(s.getName() + " has failed with mark: " + s.getMark());
            }
        }
    }
}
