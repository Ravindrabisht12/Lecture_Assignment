package org.LLD2.DesignPattern.Facade;

/**
 * LoanService - Subsystem class for loan operations.
 *
 * Learning Note:
 * - Subsystem classes encapsulate specific business logic.
 * - The facade coordinates these subsystems, so the client doesn't need to interact with them directly.
 */
public class LoanService {
    public void applyLoan(String name, double amount) {
        System.out.println(name + " applied for loan of " + amount);
    }
}

