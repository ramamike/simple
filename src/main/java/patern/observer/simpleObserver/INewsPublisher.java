package patern.observer.simpleObserver;

public interface INewsPublisher {
    void registerReader(Reader reader);
    void removeReader(Reader reader);
    void notifyReaders();
}
