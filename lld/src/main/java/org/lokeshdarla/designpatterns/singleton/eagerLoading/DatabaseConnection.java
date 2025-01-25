package lld.src.main.java.org.lokeshdarla.designpatterns.singleton.eagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        return databaseConnection;
    }
}
