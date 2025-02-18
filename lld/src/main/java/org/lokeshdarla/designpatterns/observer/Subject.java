package lld.src.main.java.org.lokeshdarla.designpatterns.observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
