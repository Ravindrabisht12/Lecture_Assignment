package org.LLD2.DesignPattern.Facade;

/**
 * AccountService - Subsystem class for account operations.
 *
 * Learning Note:
 * - In the Facade pattern, subsystem classes perform the actual work.
 * - The facade delegates requests to these classes, hiding their complexity from the client.
 */
public class AccountService {
    public void openAccount(String name) {
        System.out.println("Account opened for " + name);
    }
}

