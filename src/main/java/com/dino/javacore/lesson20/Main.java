package com.dino.javacore.lesson20;

import java.util.ArrayList;
import java.util.List;

// ============================================================
// Lesson 20 — Garbage Collection Basics
// ============================================================
// Demonstrates:
//   - Objects become eligible for GC when no references point to them
//   - System.gc() — a hint (not a guarantee) to run GC
//   - Overriding finalize() to observe GC activity (deprecated but educational)
//   - -Xmx/-Xms JVM flags for heap size control
//   - Strong references vs letting objects become unreachable
// ============================================================

public class Main {

    public static void main(String[] args) {

        System.out.println("=== GC Basics Demo ===\n");

        // --- Step 1: Create objects and make them eligible for GC ---
        System.out.println("Creating objects...");
        createTemporaryObjects();

        // --- Step 2: Suggest GC ---
        System.out.println("\nRequesting GC (hint to JVM)...");
        System.gc();

        // Give GC a moment to run
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {
        }

        System.out.println("\n--- After GC suggestion ---");

        // --- Step 3: Demonstrate when objects remain alive ---
        System.out.println("\n=== Reference Lifecycle ===");
        referenceLifecycleDemo();

        // --- Step 4: Summary ---
        System.out.println("\n=== GC Summary ===");
        System.out.println("1. Objects on the heap are GC'd when unreachable");
        System.out.println("2. System.gc() is a hint — JVM decides when to collect");
        System.out.println("3. Use -Xmx256m to limit heap (e.g., 256 MB)");
        System.out.println("4. Use -Xms128m to set initial heap (e.g., 128 MB)");
        System.out.println("5. Use -verbose:gc to see GC activity in logs");
    }

    static void createTemporaryObjects() {
        for (int i = 0; i < 5; i++) {
            GcTracker obj = new GcTracker("Temp-" + i);
            System.out.println("  Created: " + obj.getName());
        }
        // All GcTracker objects created above are now unreachable
        // (no references outside this method scope)
        System.out.println("  All temp objects are now eligible for GC");
    }

    static void referenceLifecycleDemo() {
        List<GcTracker> alive = new ArrayList<>();

        // These objects are HELD by the list → NOT eligible for GC
        alive.add(new GcTracker("Alive-1"));
        alive.add(new GcTracker("Alive-2"));
        System.out.println("Objects held in list: " + alive.size() + " (NOT GC eligible)");

        // Remove reference → now eligible
        alive.clear();
        System.out.println("After list.clear(): objects are now GC eligible");

        System.gc();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ignored) {
        }
    }
}

class GcTracker {
    private final String name;

    public GcTracker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GcTracker{" + name + "}";
    }
}
