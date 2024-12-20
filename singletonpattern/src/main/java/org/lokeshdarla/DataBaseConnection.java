package singletonpattern.src.main.java.org.lokeshdarla;

public class DataBaseConnection {
    private static DataBaseConnection instance;

    private DataBaseConnection() {
        System.out.println("DataBaseConnection created");
    }

    public static DataBaseConnection getInstance() {
        if (instance == null) {
            synchronized (DataBaseConnection.class) {
                if (instance == null) {
                    instance = new DataBaseConnection();
                }
            }
        }
        return instance;
    }
}
