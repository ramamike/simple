package patern.observer.simpleObserver;

import java.util.ArrayList;
import java.util.List;

public class GoodNewsPublisher implements INewsPublisher{

    private List<Reader> newsReaders;
    private String goodNews;

    public GoodNewsPublisher() {
        newsReaders = new ArrayList<>();
    }

    public void setGoodNews(String goodNews) {
        this.goodNews = goodNews;
        notifyReaders();
    }

    @Override
    public void registerReader(Reader reader) {
        newsReaders.add(reader);
    }

    @Override
    public void removeReader(Reader reader) {
        newsReaders.remove(reader);
    }

    @Override
    public void notifyReaders() {
        for (Reader newsReader: newsReaders) {
            newsReader.update(goodNews);
        }
    }
}
