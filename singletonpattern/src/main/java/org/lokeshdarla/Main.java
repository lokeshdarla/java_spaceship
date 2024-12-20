package singletonpattern.src.main.java.org.lokeshdarla;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            DataBaseConnection obj = DataBaseConnection.getInstance();
            System.out.println("Instance from thread 1: " + obj.hashCode());
        });

        Thread t2 = new Thread(() -> {
            DataBaseConnection obj = DataBaseConnection.getInstance();
            System.out.println("Instance from thread 2: " + obj.hashCode());
        });

        Thread t3 = new Thread(() -> {
            DataBaseConnection obj = DataBaseConnection.getInstance();
            System.out.println("Instance from thread 3: " + obj.hashCode());
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
