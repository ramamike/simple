package patern.observer.simpleObserver;

import lombok.Getter;

@Getter
public class Reader {
    private String name;
    public Reader(String name, INewsPublisher publisher) {
        this.name = name;
        publisher.registerReader(this);
    }

    void update(String news) {
        System.out.println(name + " get news: " + news);
    }
}
