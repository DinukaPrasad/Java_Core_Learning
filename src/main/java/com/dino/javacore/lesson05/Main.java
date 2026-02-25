package com.dino.javacore.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// ============================================================
// Lesson 05 — List, Set, Map
// ============================================================
// Demonstrates:
//   - ArrayList  — ordered, allows duplicates
//   - HashSet    — unordered, no duplicates
//   - HashMap    — key-value pairs, fast lookup
//   - Converting between collection types
// ============================================================

public class Main {

    public static void main(String[] args) {

        // --- ArrayList: ordered, allows duplicates ---
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("John"); // duplicate allowed
        System.out.println("List (allows duplicates): " + students);

        System.out.println("---");

        // --- HashSet: unordered, removes duplicates ---
        Set<String> uniqueStudents = new HashSet<>(students);
        System.out.println("Set  (unique only):       " + uniqueStudents);

        System.out.println("---");

        // --- HashMap: key-value pairs ---
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John", 85);
        studentGrades.put("Jane", 90);
        studentGrades.put("Bob", 72);
        System.out.println("Map  (key → value):       " + studentGrades);

        // Accessing values by key
        System.out.println("John's grade: " + studentGrades.get("John"));

        // Check existence
        System.out.println("Contains 'Jane'? " + studentGrades.containsKey("Jane"));
        System.out.println("Contains grade 100? " + studentGrades.containsValue(100));
    }
}
