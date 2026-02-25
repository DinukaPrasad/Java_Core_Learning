package com.dino.javacore.lesson21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ============================================================
// Lesson 21 — Memory Leaks
// ============================================================
// Demonstrates common memory leak patterns in Java:
//   1. Unbounded collections that grow forever
//   2. Static collections holding references
//   3. Forgotten listeners / callbacks
//   4. String.intern() abuse
//   5. How to detect and avoid leaks
// ============================================================

public class Main {

    // --- Leak Pattern 1: Static collection that never shrinks ---
    private static final List<String> eventLog = new ArrayList<>();

    // --- Leak Pattern 2: Cache without eviction ---
    private static final Map<Integer, byte[]> cache = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("=== Memory Leak Patterns ===\n");

        // Pattern 1: Unbounded collection growth
        System.out.println("--- Pattern 1: Unbounded Collection ---");
        unboundedCollectionDemo();

        // Pattern 2: Cache without eviction
        System.out.println("\n--- Pattern 2: Cache Without Eviction ---");
        cacheLeakDemo();

        // Pattern 3: Event listener leak
        System.out.println("\n--- Pattern 3: Listener Leak ---");
        listenerLeakDemo();

        // Best practices
        System.out.println("\n=== How to Prevent Memory Leaks ===");
        System.out.println("1. Use bounded collections (e.g., LRU cache with max size)");
        System.out.println("2. Remove listeners/callbacks when no longer needed");
        System.out.println("3. Prefer weak references (WeakHashMap) for caches");
        System.out.println("4. Close resources in finally or use try-with-resources");
        System.out.println("5. Profile with tools: VisualVM, JConsole, jmap, jhat");
        System.out.println("6. Monitor heap usage: -XX:+HeapDumpOnOutOfMemoryError");
    }

    // Simulates an event log that grows without bound
    static void unboundedCollectionDemo() {
        for (int i = 0; i < 1000; i++) {
            eventLog.add("Event #" + i + " at " + System.currentTimeMillis());
        }
        System.out.println("  Event log size: " + eventLog.size());
        System.out.println("  Problem: this list never shrinks — memory grows forever!");
        System.out.println("  Fix: use a bounded queue (e.g., LinkedList with max size)");

        // Fix: clear when appropriate
        eventLog.clear();
        System.out.println("  After clear: " + eventLog.size());
    }

    // Simulates a cache that stores large objects without eviction
    static void cacheLeakDemo() {
        for (int i = 0; i < 100; i++) {
            cache.put(i, new byte[1024]); // 1 KB per entry
        }
        System.out.println("  Cache size: " + cache.size() + " entries (~100 KB)");
        System.out.println("  Problem: old entries never removed — memory grows!");
        System.out.println("  Fix: use WeakHashMap or a cache with TTL/max-size eviction");

        cache.clear();
    }

    // Simulates a listener leak — registering without unregistering
    static void listenerLeakDemo() {
        EventSource source = new EventSource();

        // Register listeners but "forget" to unregister
        for (int i = 0; i < 5; i++) {
            int id = i;
            source.addListener(message -> System.out.println("    Listener " + id + " received: " + message));
        }

        source.fireEvent("Hello!");
        System.out.println("  Registered listeners: " + source.getListenerCount());
        System.out.println("  Problem: if listeners hold large objects, they won't be GC'd");

        // Fix: unregister when done
        source.clearListeners();
        System.out.println("  After cleanup: " + source.getListenerCount() + " listeners");
    }
}

// Simple event source to demonstrate listener leak pattern
interface EventListener {
    void onEvent(String message);
}

class EventSource {
    private final List<EventListener> listeners = new ArrayList<>();

    void addListener(EventListener listener) {
        listeners.add(listener);
    }

    void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    void clearListeners() {
        listeners.clear();
    }

    void fireEvent(String message) {
        for (EventListener listener : listeners) {
            listener.onEvent(message);
        }
    }

    int getListenerCount() {
        return listeners.size();
    }
}
