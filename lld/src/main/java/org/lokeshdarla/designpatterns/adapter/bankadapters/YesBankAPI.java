package lld.src.main.java.org.lokeshdarla.designpatterns.adapter.bankadapters;

public class YesBankAPI {
    public void yesBankProcessPayment(String accNo, double amt) {
        System.out.println("Processing payment via Yes Bank: " + amt + " to " + accNo);
    }

    public double yesBankGetBalance(String accNo) {
        System.out.println("Fetching balance for Yes Bank account: " + accNo);
        return 10000.0;
    }

    public void yesBankTransfer(String fromAcc, String toAcc, double amt) {
        System.out.println("Transferring " + amt + " from " + fromAcc + " to " + toAcc + " via Yes Bank");
    }
}
