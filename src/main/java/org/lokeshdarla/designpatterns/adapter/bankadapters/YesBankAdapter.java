package org.lokeshdarla.designpatterns.adapter.bankadapters;

import org.lokeshdarla.designpatterns.adapter.BankAPI;

public class YesBankAdapter implements BankAPI {
    private final YesBankAPI yesBankAPI;

    public YesBankAdapter(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }

    @Override
    public void processPayment(String accountNumber, double amount) {
        yesBankAPI.yesBankProcessPayment(accountNumber, amount);
    }

    @Override
    public double checkBalance(String accountNumber) {
        return yesBankAPI.yesBankGetBalance(accountNumber);
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        yesBankAPI.yesBankTransfer(fromAccount, toAccount, amount);
    }
}