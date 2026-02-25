package com.dino.javacore.lesson07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// ============================================================
// Lesson 07 — Sorting (Comparable / Comparator)
// ============================================================
// Demonstrates:
//   - Sorting a list of objects using Comparator
//   - Comparator.comparingInt() for numeric sorting
//   - .reversed() for descending order
//   - .thenComparing() for secondary sort criteria
//   - Comparator.comparing() for String-based sorting
// ============================================================

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dino", 78));
        students.add(new Student(2, "Kamal", 92));
        students.add(new Student(3, "Asarah", 92));
        students.add(new Student(4, "Amal", 60));

        // Sort by mark ascending
        students.sort(Comparator.comparingInt(Student::getMark));
        System.out.println("Sorted by mark (asc):");
        students.forEach(System.out::println);
        System.out.println("---");

        // Sort by mark descending, then alphabetically by name (tie-breaker)
        students.sort(Comparator.comparingInt(Student::getMark)
                .reversed()
                .thenComparing(Student::getName));
        System.out.println("Sorted by mark (desc), then name (asc):");
        students.forEach(System.out::println);
        System.out.println("---");

        // Sort alphabetically by name
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted by name (asc):");
        students.forEach(System.out::println);
    }
}
