package patern.observer.simpleObserver2;

import java.util.ArrayList;
import java.util.List;

public class GoodNewsPublisher implements IObservable {

    private List<Reader> newsReaders;
    private String goodNews;

    public GoodNewsPublisher() {
        newsReaders = new ArrayList<>();
    }

    public void setGoodNews(String goodNews) {
        this.goodNews = goodNews;
        notifyObservers();
    }

    @Override
    public void registerObserver(Reader reader) {
        newsReaders.add(reader);
    }

    @Override
    public void removeObserver(Reader reader) {
        newsReaders.remove(reader);
    }

    @Override
    public void notifyObservers() {
        for (Reader newsReader: newsReaders) {
            newsReader.update(goodNews);
        }
    }
}
