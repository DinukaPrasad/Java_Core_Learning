package Lesson04_Collections_Performance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ============================================================
// Collections Performance — List vs Map Search Benchmark
// ============================================================
// Demonstrates:
//   - Linear search through ArrayList  — O(n) time complexity
//   - Constant-time lookup with HashMap — O(1) time complexity
//   - Using System.nanoTime() to measure execution time
//   - Why choosing the right data structure matters
// ============================================================

public class ex1 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Map<Integer, Student> map = new HashMap<>();

        // Populate both collections with 1000 students
        for (int i = 1; i <= 1000; i++) {
            Student s = new Student(i, "Student" + i);
            list.add(s);
            map.put(i, s);
        }

        // Search for student #999 using list (linear scan)
        searchInLIst(list, 999);
        // Search for student #999 using map (direct lookup)
        searchInMap(map, 999);

    }

    // Linear search — iterates through the entire list until the target is found
    static void searchInLIst(List<Student> list, int targetId) {
        long startTime = System.nanoTime();
        long endTime;

        for (Student s : list) {
            if (s.getId() == targetId) {
                endTime = System.nanoTime();
                System.out.println("Student found: " + s.getName());
                System.out.println("Time taken for list search: " + (endTime - startTime) + " nanoseconds");
                break;
            }
        }
    }

    // HashMap lookup — retrieves the value directly by key in O(1)
    static void searchInMap(Map<Integer, Student> map, int targetId) {
        long startTime = System.nanoTime();
        long endTime;

        Student student = map.get(targetId);
        endTime = System.nanoTime();
        System.out.println("Student found: " + student.getName());
        System.out.println("Time taken for map search: " + (endTime - startTime) + " nanoseconds");
    }

}
