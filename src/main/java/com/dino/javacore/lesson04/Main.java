package com.dino.javacore.lesson04;

import java.util.ArrayList;
import java.util.List;

// ============================================================
// Lesson 04 — Polymorphism + Abstraction
// ============================================================
// Demonstrates:
//   - Defining an interface (Notifiable)
//   - Multiple classes implementing the same interface
//   - Polymorphic behavior — calling the same method on different types
//   - Loose coupling via interface-based design
// ============================================================

public class Main {

    public static void main(String[] args) {
        // Create a list of Notifiable objects (polymorphism — different types, same
        // interface)
        List<Notifiable> channels = new ArrayList<>();

        channels.add(new EmailNotification());
        channels.add(new SmsNotification());
        channels.add(new PushNotification());

        // Send the same message through all notification channels
        NotificationService.notifyAll(channels, "Hello world!");
    }
}

// Functional interface — defines contract for sending notifications
interface Notifiable {
    void sendNotification(String message);
}

// Concrete implementation — Email channel
class EmailNotification implements Notifiable {
    @Override
    public void sendNotification(String message) {
        System.out.println("[EMAIL] " + message);
    }
}

// Concrete implementation — SMS channel
class SmsNotification implements Notifiable {
    @Override
    public void sendNotification(String message) {
        System.out.println("[SMS] " + message);
    }
}

// Concrete implementation — Push notification channel
class PushNotification implements Notifiable {
    @Override
    public void sendNotification(String message) {
        System.out.println("[PUSH] " + message);
    }
}

// Service class that works with the Notifiable interface (not concrete classes)
class NotificationService {

    // Iterates over all notifiables and triggers each one — polymorphism in action
    public static void notifyAll(List<Notifiable> list, String msg) {
        for (Notifiable notifier : list) {
            notifier.sendNotification(msg);
        }
    }
}
