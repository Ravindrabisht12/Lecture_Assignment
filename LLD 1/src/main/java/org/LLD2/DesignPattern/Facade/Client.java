package org.LLD2.DesignPattern.Facade;

/**
 * Client - Demonstrates usage of the Facade pattern.
 *
 * Learning Note:
 * - The client interacts only with the Facade (BankingFacade), not with subsystem classes directly.
 * - This simplifies client code and hides subsystem complexity.
 */
public class Client {
    public static void main(String[] args) {
        BankingFacade facade = new BankingFacade();
        facade.openAccount("Ravindra");
        facade.applyForLoan("Ravindra", 50000);
    }
}

