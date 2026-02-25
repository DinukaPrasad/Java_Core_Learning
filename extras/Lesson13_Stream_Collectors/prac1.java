package Lesson13_Stream_Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// ============================================================
// Stream Collectors — groupingBy, averagingInt, mapping, counting
// ============================================================
// Demonstrates:
//   - mapToInt().sum()         — summing primitive values
//   - Collectors.groupingBy()  — grouping elements by a classifier
//   - Collectors.averagingInt() — computing average per group
//   - Collectors.mapping()     — transforming grouped elements
//   - Collectors.counting()    — counting elements per group
//   - Downstream collectors    — chaining collectors inside groupingBy
// ============================================================

public class prac1 {
        public static void main(String[] args) {
                List<Student> students = List.of(new Student("Alice", 85, "CS"),
                                new Student("Bob", 92, "Math"),
                                new Student("Charlie", 35, "CS"),
                                new Student("David", 49, "Math"),
                                new Student("Eve", 88, "CS"));

                // Sum all marks using mapToInt stream
                int totalMarks = students.stream().mapToInt(Student::getMark).sum();
                System.out.println("Total marks: " + totalMarks);

                // Group by programme and calculate average mark per programme
                Map<String, Double> studentsByProgramme = students.stream()
                                .collect(Collectors.groupingBy(Student::getProgramme,
                                                Collectors.averagingInt(Student::getMark)));
                System.out.println(studentsByProgramme);

                // Group students into "Pass" / "Fail" and collect their names
                Map<String, List<String>> studentDetails = students.stream()
                                .collect(Collectors.groupingBy(s -> s.getMark() >= 50 ? "Pass" : "Fail",
                                                Collectors.mapping(Student::getName, Collectors.toList())));

                // Count how many passed vs failed
                Map<String, Long> studentCount = students.stream()
                                .collect(Collectors.groupingBy(s -> s.getMark() >= 50 ? "Pass" : "Fail",
                                                Collectors.counting()));

                System.out.println(studentDetails);
                System.out.println(studentCount);

        }
}
