package org.LLD2.DesignPattern.Adapter;

public class Bank {
    private String accountNumber;
    private String ifscCode;

    public Bank(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }
}
