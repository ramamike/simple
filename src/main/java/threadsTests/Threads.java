package threadsTests;

public class Threads {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnableThread = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1: " + Thread.currentThread().getName() + " | Hello world!");
            }
        };

        Runnable runnableThread2 = () -> {
            System.out.println("Thread 2: " + Thread.currentThread().getName() + " | Hello world!");
        };
        Thread thread = new Thread(runnableThread);
        thread.start();
        thread.join();

        Thread thread2 = new Thread(runnableThread2);
        thread2.start();

        System.out.println("Thread: " + Thread.currentThread().getName() + " | Finished");
    }
}