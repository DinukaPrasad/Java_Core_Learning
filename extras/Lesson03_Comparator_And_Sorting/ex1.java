package Lesson03_Comparator_And_Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// ============================================================
// Comparator & Sorting — Custom Sorting with Comparator
// ============================================================
// Demonstrates:
//   - Sorting a list of objects using Comparator
//   - Comparator.comparingInt() for numeric sorting
//   - .reversed() for descending order
//   - .thenComparing() for secondary sort criteria
//   - Comparator.comparing() for String-based sorting
// ============================================================

public class ex1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dino", 78));
        students.add(new Student(2, "Kamal", 92));
        students.add(new Student(3, "Asarah", 92));
        students.add(new Student(4, "Amal", 60));

        // Sort by mark in ascending order
        students.sort(Comparator.comparingInt(Student::getMark));

        System.out.println(students);
        System.out.println("-----------------------------\n");

        // Sort by mark descending, then alphabetically by name (tie-breaker)
        students.sort(Comparator.comparingInt(Student::getMark).reversed().thenComparing(Student::getName));

        System.out.println(students);
        System.out.println("-----------------------------\n");

        // Sort alphabetically by name
        students.sort(Comparator.comparing(Student::getName));

        System.out.println(students);
        System.out.println("-----------------------------\n");

    }

}
