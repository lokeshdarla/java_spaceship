package org.lokeshdarla.designpatterns.adapter;

import org.lokeshdarla.designpatterns.adapter.bankadapters.ICICIBankAPI;
import org.lokeshdarla.designpatterns.adapter.bankadapters.ICICIBankAdapter;
import org.lokeshdarla.designpatterns.adapter.bankadapters.YesBankAPI;
import org.lokeshdarla.designpatterns.adapter.bankadapters.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        // Yes Bank
        BankAPI yesBankAdapter = new YesBankAdapter(new YesBankAPI());
        PhonePeService phonePeYesBank = new PhonePeService(yesBankAdapter);
        phonePeYesBank.makePayment("123456789", 5000);
        System.out.println("Balance: " + phonePeYesBank.checkBalance("123456789"));
        phonePeYesBank.transferFunds("123456789", "987654321", 3000);

        // ICICI Bank
        BankAPI iciciBankAdapter = new ICICIBankAdapter(new ICICIBankAPI());
        PhonePeService phonePeICICI = new PhonePeService(iciciBankAdapter);
        phonePeICICI.makePayment("987654321", 10000);
        System.out.println("Balance: " + phonePeICICI.checkBalance("987654321"));
        phonePeICICI.transferFunds("987654321", "123456789", 5000);
    }
}
