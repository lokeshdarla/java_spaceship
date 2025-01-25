package lld.src.main.java.org.lokeshdarla.designpatterns.facade.services;

public class NotificationService {
    public void sendEmail(String email) {
        System.out.println("Order confirmation email sent to: " + email);
    }

    public void sendAppNotification(String user) {
        System.out.println("App notification sent to user: " + user);
    }
}
