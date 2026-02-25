package com.dino.javacore.lesson18;

import java.util.List;
import java.util.stream.Stream;

// ============================================================
// Lesson 18 — Stream Pitfalls
// ============================================================
// Demonstrates common mistakes when using Java Streams:
//   1. A stream can only be consumed ONCE
//   2. Streams are lazy — nothing happens without a terminal op
//   3. Side-effects in map/filter are a bad idea
//   4. Modifying the source collection during a stream
//   5. Choosing between stream() and parallelStream()
// ============================================================

public class Main {

    public static void main(String[] args) {

        // --- Pitfall 1: Stream can only be consumed once ---
        System.out.println("=== Pitfall 1: Single-use stream ===");
        Stream<String> stream = Stream.of("A", "B", "C");
        stream.forEach(System.out::println);
        try {
            stream.forEach(System.out::println); // IllegalStateException!
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName()
                    + " — stream already consumed!\n");
        }

        // --- Pitfall 2: Streams are lazy ---
        System.out.println("=== Pitfall 2: Lazy evaluation ===");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // No terminal operation → nothing executes!
        numbers.stream()
                .filter(n -> {
                    System.out.println("  filtering " + n); // never prints!
                    return n > 3;
                });
        System.out.println("(Nothing printed above — no terminal operation)\n");

        // With a terminal operation, it runs:
        System.out.println("Now with .toList() terminal op:");
        List<Integer> result = numbers.stream()
                .filter(n -> {
                    System.out.println("  filtering " + n);
                    return n > 3;
                })
                .toList();
        System.out.println("Result: " + result + "\n");

        // --- Pitfall 3: Side-effects in intermediate operations ---
        System.out.println("=== Pitfall 3: Avoid side-effects ===");
        // BAD: modifying external state inside map
        int[] counter = { 0 };
        List<Integer> doubled = numbers.stream()
                .map(n -> {
                    counter[0]++; // side-effect — avoid this!
                    return n * 2;
                })
                .toList();
        System.out.println("Doubled: " + doubled);
        System.out.println("Counter (side-effect): " + counter[0]);
        System.out.println("Better: use .count() or collect for aggregation\n");

        // --- Pitfall 4: Parallel streams aren't always faster ---
        System.out.println("=== Pitfall 4: Parallel stream overhead ===");
        long start = System.nanoTime();
        numbers.stream().mapToInt(n -> n * 2).sum();
        long seqTime = System.nanoTime() - start;

        start = System.nanoTime();
        numbers.parallelStream().mapToInt(n -> n * 2).sum();
        long parTime = System.nanoTime() - start;

        System.out.println("Sequential: " + seqTime + " ns");
        System.out.println("Parallel:   " + parTime + " ns");
        System.out.println("For small data, sequential is often faster!");
    }
}
