package lld.src.main.java.org.lokeshdarla.designpatterns;

import org.lokeshdarla.designpatterns.singleton.doubleCheckLocking.DatabaseConnection;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting Multithreaded Singleton Test");

        // Creating multiple threads that try to access the singleton instance
        Thread thread1 = new Thread(() -> {
            DatabaseConnection connection = DatabaseConnection.getInstance();
            System.out.println("Thread 1: " + connection.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            DatabaseConnection connection = DatabaseConnection.getInstance();
            System.out.println("Thread 2: " + connection.hashCode());
        });

        Thread thread3 = new Thread(() -> {
            DatabaseConnection connection = DatabaseConnection.getInstance();
            System.out.println("Thread 3: " + connection.hashCode());
        });

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
