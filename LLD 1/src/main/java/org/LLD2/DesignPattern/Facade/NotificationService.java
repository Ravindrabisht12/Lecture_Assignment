package org.LLD2.DesignPattern.Facade;

/**
 * NotificationService - Subsystem class for notifications.
 *
 * Learning Note:
 * - Subsystem classes can represent external services or utilities.
 * - The facade can combine multiple subsystems to provide a unified interface for the client.
 */
public class NotificationService {
    public void sendNotification(String name, String message) {
        System.out.println("Notification to " + name + ": " + message);
    }
}

