package Lesson08_Multithreading_Basics;

// ============================================================
// Multithreading Basics — Creating & Running Threads
// ============================================================
// Demonstrates:
//   - Creating threads using Runnable (lambda syntax)
//   - Naming threads via the Thread constructor
//   - Concurrent execution — two threads running in parallel
//   - Thread.sleep() to simulate work
//   - InterruptedException handling
// ============================================================

public class ex {
    public static void main(String[] args) {

        // int[] count = { 0 };

        // Task 1: Simulate cooking eggs in 5 steps
        Runnable cookEggs = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": Cooking eggs... step " + i);
                try {
                    Thread.sleep(100); // Simulate time taken to cook eggs
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Task 2: Simulate making tea in 5 steps
        Runnable makeTea = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": Making tea... step " + i);
                try {
                    Thread.sleep(100); // Simulate time taken to make tea
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Runnable counting = () -> {
        // for (int i = 1; i <= 5; i++) {
        // count[0]++;
        // }
        // };

        // Create two threads with custom names and start them concurrently
        Thread chefA = new Thread(cookEggs, "Chef A");
        Thread chefB = new Thread(makeTea, "Chef B");

        chefA.start(); // Starts Chef A in a new thread
        chefB.start(); // Starts Chef B in a new thread

        // This prints from the main thread — may appear before/after/between thread
        // output
        System.out.println("Manager: Orders are being prepared!");
    }
}