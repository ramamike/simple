package patern.observer.simpleObserver2;

public interface IObservable {
    void registerObserver(Reader reader);
    void removeObserver(Reader reader);
    void notifyObservers();
}
