package Lesson12_Stream_API;

import java.util.List;

// ============================================================
// Stream Practice 1 — filter + map Pipeline
// ============================================================
// Demonstrates:
//   - Filtering elements divisible by 5
//   - Mapping (transforming) each element by doubling it
//   - Collecting results into an immutable list with .toList()
// ============================================================

public class prac1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 15, 20, 25, 30);

        // Pipeline: keep multiples of 5 → double each value → collect
        List<Integer> filteredNumList = nums.stream()
                .filter(n -> n % 5 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println(filteredNumList);
    }
}
