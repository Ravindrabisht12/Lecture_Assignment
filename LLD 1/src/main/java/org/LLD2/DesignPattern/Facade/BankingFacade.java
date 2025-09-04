package org.LLD2.DesignPattern.Facade;

import org.LLD2.DesignPattern.Facade.Services.AccountService;
import org.LLD2.DesignPattern.Facade.Services.LoanService;
import org.LLD2.DesignPattern.Facade.Services.NotificationService;

/**
 * Facade Design Pattern Example - Learning Guide
 *
 * The Facade pattern provides a simplified interface to a complex subsystem.
 * It hides the complexity of the system and exposes only what is necessary for the client.
 *
 * Real-world analogy: Think of a bank ATM. The ATM (facade) provides simple methods to withdraw, deposit, or check balance,
 * while hiding the complex interactions with banking systems, security, and account management.
 *
 * Benefits:
 * - Reduces complexity for the client
 * - Promotes loose coupling between client and subsystem
 * - Makes code easier to use and maintain
 *
 * Example below: A simple BankingFacade that wraps multiple banking operations.
 */
public class BankingFacade {
    private AccountService accountService;
    private LoanService loanService;
    private NotificationService notificationService;

    public BankingFacade() {
        this.accountService = new AccountService();
        this.loanService = new LoanService();
        this.notificationService = new NotificationService();
    }

    // Facade method: Open a new account and send notification
    public void openAccount(String name) {
        accountService.openAccount(name);
        notificationService.sendNotification(name, "Account opened successfully!");
    }

    // Facade method: Apply for a loan and notify
    public void applyForLoan(String name, double amount) {
        loanService.applyLoan(name, amount);
        notificationService.sendNotification(name, "Loan application submitted!");
    }
}
