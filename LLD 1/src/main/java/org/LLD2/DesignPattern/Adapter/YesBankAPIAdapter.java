package org.LLD2.DesignPattern.Adapter;

public class YesBankAPIAdapter implements BankAPI{

    @Override
    public void addBankAccount(Bank bank) {
        System.out.println("Yes Bank account added: " + bank.getAccountNumber());
    }

    @Override
    public void pay(String accountNumber, double amount) {
        System.out.println("Paid " + amount + " from Yes Bank account: " + accountNumber);
    }

    @Override
    public double checkBalance(String accountNumber) {
       return 10000;
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferred " + amount + " from Yes Bank account: " + fromAccount + " to account: " + toAccount);
    }
}
