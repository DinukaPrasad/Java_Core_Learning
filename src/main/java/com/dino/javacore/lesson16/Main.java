package com.dino.javacore.lesson16;

import java.util.List;

// ============================================================
// Lesson 16 — Stream Pipeline Operations
// ============================================================
// Demonstrates:
//   - .stream()  — converts a collection into a stream
//   - .filter()  — keeps only elements matching a condition
//   - .sorted()  — sorts using a custom comparator
//   - .map()     — transforms each element
//   - .toList()  — terminal operation collecting into a List
//   - .forEach() — terminal operation for side-effects
// ============================================================

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 35),
                new Student("David", 49),
                new Student("Eve", 88));

        // Pipeline: filter passing students → sort descending → extract marks
        System.out.println("=== Passing students' marks (desc) ===");
        List<Integer> passMarks = students.stream()
                .filter(s -> s.getMark() >= 50)
                .sorted((a, b) -> b.getMark() - a.getMark())
                .map(Student::getMark)
                .toList();
        System.out.println(passMarks);

        // filter + map pipeline on numbers
        System.out.println("\n=== Numbers divisible by 5, doubled ===");
        List<Integer> nums = List.of(10, 15, 20, 25, 30);
        List<Integer> result = nums.stream()
                .filter(n -> n % 5 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println(result);

        // forEach terminal operation — print failed students
        System.out.println("\n=== Failed students ===");
        students.stream()
                .filter(s -> s.getMark() < 50)
                .map(Student::toString)
                .forEach(System.out::println);
    }
}
