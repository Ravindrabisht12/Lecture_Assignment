package org.LLD2.DesignPattern.Adapter;

public class PhonePe {
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    void performBankOperations() {
        Bank bank = new Bank( "1234567890", "ICICI0001234");
        bankAPI.addBankAccount(bank);

        bankAPI.pay("233245", 500.0);
    }
}
