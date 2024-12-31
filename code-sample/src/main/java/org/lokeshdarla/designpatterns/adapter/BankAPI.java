package org.lokeshdarla.designpatterns.adapter;

public  interface BankAPI {
    void processPayment(String accountNumber, double amount);
    double checkBalance(String accountNumber);
    void transferFunds(String fromAccount, String toAccount, double amount);
}
