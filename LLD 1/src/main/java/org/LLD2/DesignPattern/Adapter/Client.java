package org.LLD2.DesignPattern.Adapter;


/**
 * Adapter Design Pattern Example
 *
 * The Adapter pattern acts as a bridge between two incompatible interfaces.
 *
 * Key Components:
 * 1. Target Interface (BankAPI): The interface that the client code expects to work with
 * 2. Adapter (ICICIBankAPIAdapter): Implements the target interface and wraps the adaptee
 * 3. Adaptee (ICICI's actual API): The incompatible interface that needs adapting
 * 4. Client (PhonePe): Uses the Target interface
 *
 * Benefits:
 * - Allows classes with incompatible interfaces to work together
 * - Provides a clean way to reuse existing code
 * - Follows Single Responsibility and Open/Closed principles
 * - Enables integration with third-party libraries without modifying their code
 *
 * Real-world examples:
 * - Payment gateways adapting to different banking systems
 * - Legacy system integration
 * - Hardware adapters (like USB-to-HDMI)
 */

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIBankAPIAdapter();
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.performBankOperations();
    }
}
