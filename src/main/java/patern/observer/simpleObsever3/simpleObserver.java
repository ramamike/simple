package patern.observer.simpleObsever3;

public class simpleObserver {
    public static void main(String[] args) {

        GoodNewsPublisher newsPublisher = new GoodNewsPublisher();

        newsPublisher.addPropertyChangeListener(new Reader("reader 1"));
        newsPublisher.addPropertyChangeListener(new Reader("reader 2"));

        newsPublisher.setNews("The first good news");
        newsPublisher.setNews("The second good news");
    }

}
