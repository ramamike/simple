package patern.observer.simpleObserver2;

public class simpleObserver {
    public static void main(String[] args) {

        GoodNewsPublisher newsPublisher = new GoodNewsPublisher();

        Reader newsReader1 = new Reader("reader 1", newsPublisher);
        Reader newsReader2 = new Reader("reader 2", newsPublisher);

        newsPublisher.setGoodNews("The first good news");
    }

}
