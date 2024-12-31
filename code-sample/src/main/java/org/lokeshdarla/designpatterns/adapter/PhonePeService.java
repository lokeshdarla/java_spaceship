package org.lokeshdarla.designpatterns.adapter;

class PhonePeService {
    private BankAPI bankAPI;

    public PhonePeService(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void makePayment(String accountNumber, double amount) {
        this.bankAPI.processPayment(accountNumber, amount);
    }

    public double checkBalance(String accountNumber) {
        return this.bankAPI.checkBalance(accountNumber);
    }

    public void transferFunds(String fromAccount, String toAccount, double amount) {
       this.bankAPI.transferFunds(fromAccount, toAccount, amount);
    }
}