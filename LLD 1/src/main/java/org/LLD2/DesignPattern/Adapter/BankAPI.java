package org.LLD2.DesignPattern.Adapter;

public interface BankAPI {
    public void addBankAccount(Bank bank);
    public void pay(String accountNumber, double amount);
    public double checkBalance(String accountNumber);
    public void transferFunds(String fromAccount, String toAccount, double amount);
}