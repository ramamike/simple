package patern.observer.simpleObsever3;

import patern.observer.simpleObserver2.IObservable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class GoodNewsPublisher {

    private PropertyChangeSupport support;
    private String goodNews;

    public GoodNewsPublisher() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.goodNews, value);
        this.goodNews = value;
    }
}
