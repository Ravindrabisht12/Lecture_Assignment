package org.LLD2.DesignPattern.Adapter;

public class ICICIBankAPIAdapter implements BankAPI{

    private ICICIBank iciciBank;

    // Only use this if any ICICIBank specific methods are needed
//    public ICICIBankAPIAdapter(ICICIBank iciciBank) {
//        this.iciciBank = iciciBank;
//    }

    @Override
    public void addBankAccount(Bank bank) {
        System.out.println("ICICI Bank account added: " + bank.getAccountNumber());
    }

    @Override
    public void pay(String accountNumber, double amount) {
        System.out.println("Paid " + amount + " from ICICI Bank account: " + accountNumber);
    }

    @Override
    public double checkBalance(String accountNumber) {
        return 20;
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferred " + amount + " from ICICI Bank account: " + fromAccount + " to account: " + toAccount);
    }
}
