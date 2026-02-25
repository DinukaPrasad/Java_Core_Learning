package Lesson12_Stream_API;

import java.util.List;

// ============================================================
// Stream API — filter, sorted, map, toList Pipeline
// ============================================================
// Demonstrates:
//   - .stream()  — converts a collection into a stream
//   - .filter()  — keeps only elements matching a condition
//   - .sorted()  — sorts using a custom comparator (descending marks)
//   - .map()     — transforms each element (Student → Integer mark)
//   - .toList()  — terminal operation collecting results into a List
// ============================================================

public class ex {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 35),
                new Student("David", 49),
                new Student("Eve", 88));

        // Pipeline: filter passing students → sort descending → extract marks
        List<Integer> passStudents = students.stream()
                .filter(s -> s.getMark() >= 50)
                .sorted((a, b) -> b.getMark() - a.getMark())
                .map(Student::getMark)
                .toList();

        System.out.println(passStudents);

    }
}
