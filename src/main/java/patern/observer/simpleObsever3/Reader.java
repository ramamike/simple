package patern.observer.simpleObsever3;

import lombok.Getter;
import patern.observer.simpleObserver2.IObservable;
import patern.observer.simpleObserver2.IObserver;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@Getter
public class Reader implements PropertyChangeListener {
    private String name;
    public Reader(String name) {
        this.name = name;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public void setNews(String news) {
        System.out.println(name + " get news: " + news);
    }
}
