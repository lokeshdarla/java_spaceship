package org.lokeshdarla.designpatterns.adapter.bankadapters;

public  class ICICIBankAPI {
    public void iciciBankTransfer(String account, double value) {
        System.out.println("Processing payment via ICICI Bank: " + value + " to " + account);
    }

    public double iciciBankCheckBalance(String accNo) {
        System.out.println("Fetching balance for ICICI Bank account: " + accNo);
        return 20000.0; // Example balance
    }

    public void iciciBankFundTransfer(String fromAcc, String toAcc, double amt) {
        System.out.println("Transferring " + amt + " from " + fromAcc + " to " + toAcc + " via ICICI Bank");
    }
}
