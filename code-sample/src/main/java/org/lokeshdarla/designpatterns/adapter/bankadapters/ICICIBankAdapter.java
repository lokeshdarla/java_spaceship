package org.lokeshdarla.designpatterns.adapter.bankadapters;


import org.lokeshdarla.designpatterns.adapter.BankAPI;

public  class ICICIBankAdapter implements BankAPI {
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter(ICICIBankAPI iciciBankAPI) {
        this.iciciBankAPI = iciciBankAPI;
    }

    @Override
    public void processPayment(String accountNumber, double amount) {
        iciciBankAPI.iciciBankTransfer(accountNumber, amount);
    }

    @Override
    public double checkBalance(String accountNumber) {
        return iciciBankAPI.iciciBankCheckBalance(accountNumber);
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        iciciBankAPI.iciciBankFundTransfer(fromAccount, toAccount, amount);
    }
}