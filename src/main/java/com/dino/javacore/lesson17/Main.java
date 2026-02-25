package com.dino.javacore.lesson17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// ============================================================
// Lesson 17 — reduce + Grouping Collectors
// ============================================================
// Demonstrates:
//   - mapToInt().sum()          — summing primitive values
//   - Collectors.groupingBy()   — grouping elements by a classifier
//   - Collectors.averagingInt()  — average per group
//   - Collectors.mapping()      — transforming grouped elements
//   - Collectors.counting()     — counting elements per group
//   - Stream vs loop comparison
// ============================================================

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 85, "CS"),
                new Student("Bob", 92, "Math"),
                new Student("Charlie", 35, "CS"),
                new Student("David", 49, "Math"),
                new Student("Eve", 88, "CS"));

        // Sum all marks using mapToInt
        int totalMarks = students.stream().mapToInt(Student::getMark).sum();
        System.out.println("Total marks: " + totalMarks);

        // Group by programme → average mark per programme
        System.out.println("\n=== Average mark per programme ===");
        Map<String, Double> avgByProgramme = students.stream()
                .collect(Collectors.groupingBy(Student::getProgramme,
                        Collectors.averagingInt(Student::getMark)));
        System.out.println(avgByProgramme);

        // Group into "Pass" / "Fail" → collect names
        System.out.println("\n=== Pass vs Fail (names) ===");
        Map<String, List<String>> passFail = students.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getMark() >= 50 ? "Pass" : "Fail",
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(passFail);

        // Count pass vs fail
        System.out.println("\n=== Pass vs Fail (count) ===");
        Map<String, Long> passFailCount = students.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getMark() >= 50 ? "Pass" : "Fail",
                        Collectors.counting()));
        System.out.println(passFailCount);

        // Stream vs loop comparison
        System.out.println("\n=== Stream vs Loop ===");
        System.out.println("Stream approach:");
        students.stream()
                .filter(s -> s.getMark() < 50)
                .map(Student::getName)
                .forEach(name -> System.out.println("  " + name));

        System.out.println("Loop approach:");
        for (Student s : students) {
            if (s.getMark() < 50) {
                System.out.println("  " + s.getName() + " (mark: " + s.getMark() + ")");
            }
        }
    }
}
