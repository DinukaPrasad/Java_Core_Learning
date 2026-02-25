package Lesson01_OOP_Fundamentals;

import java.util.ArrayList;
import java.util.List;

// ============================================================
// Polymorphism & Interfaces — Notification System Example
// ============================================================
// Demonstrates:
//   - Defining an interface (Notifiable)
//   - Multiple classes implementing the same interface
//   - Polymorphic behavior — calling the same method on different types
//   - Loose coupling via interface-based design
// ============================================================

public class ex3 {

    public static void main(String[] args) {
        // Create a list of Notifiable objects (polymorphism — different types, same
        // interface)
        List<Notifiable> notifiables = new ArrayList<>();

        notifiables.add(new EmailNotification());
        notifiables.add(new SMSNotification());
        notifiables.add(new PushNotification());

        // Send the same message through all notification channels
        NotificationService.notifyAll(notifiables, "Hellow world");
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
        System.out.println("Sending email notification: " + message);
    }
}

// Concrete implementation — SMS channel
class SMSNotification implements Notifiable {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

// Concrete implementation — Push notification channel
class PushNotification implements Notifiable {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

// Service class that works with the Notifiable interface (not concrete classes)
class NotificationService {

    // Iterates over all notifiables and triggers each one — demonstrates
    // polymorphism
    public static void notifyAll(List<Notifiable> list, String msg) {
        for (Notifiable notifier : list) {
            notifier.sendNotification(msg);
        }
    }
}
