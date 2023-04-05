package patern.observer.simpleObserver2;

import lombok.Getter;

@Getter
public class Reader implements IObserver {
    private String name;
    public Reader(String name, IObservable publisher) {
        this.name = name;
        publisher.registerObserver(this);
    }

    @Override
    public void update(String news) {
        System.out.println(name + " get news: " + news);
    }
}
