package com.dino.javacore.lesson08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ============================================================
// Lesson 08 — Collections Performance Intuition
// ============================================================
// Demonstrates:
//   - Linear search through ArrayList  — O(n) time complexity
//   - Constant-time lookup with HashMap — O(1) time complexity
//   - Using System.nanoTime() to measure execution time
//   - Why choosing the right data structure matters
// ============================================================

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Map<Integer, Student> map = new HashMap<>();

        // Populate both collections with 1,000 students
        for (int i = 1; i <= 1000; i++) {
            Student s = new Student(i, "Student" + i);
            list.add(s);
            map.put(i, s);
        }

        // Search for student #999 using list (linear scan)
        System.out.println("=== List Search (O(n)) ===");
        searchInList(list, 999);

        System.out.println();

        // Search for student #999 using map (direct lookup)
        System.out.println("=== Map Search (O(1)) ===");
        searchInMap(map, 999);
    }

    // Linear search — iterates through the entire list until the target is found
    static void searchInList(List<Student> list, int targetId) {
        long startTime = System.nanoTime();

        for (Student s : list) {
            if (s.getId() == targetId) {
                long endTime = System.nanoTime();
                System.out.println("Found: " + s.getName());
                System.out.println("Time:  " + (endTime - startTime) + " ns");
                return;
            }
        }
    }

    // HashMap lookup — retrieves the value directly by key in O(1)
    static void searchInMap(Map<Integer, Student> map, int targetId) {
        long startTime = System.nanoTime();

        Student student = map.get(targetId);
        long endTime = System.nanoTime();
        System.out.println("Found: " + student.getName());
        System.out.println("Time:  " + (endTime - startTime) + " ns");
    }
}
