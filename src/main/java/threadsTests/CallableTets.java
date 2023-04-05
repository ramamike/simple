package threadsTests;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTets {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable task = () -> {
            System.out.println("Callable: " + Thread.currentThread().getName());
            return "Callable task";
        };
        FutureTask<String> future = new FutureTask<>(task);
        new Thread(future).start();
        System.out.println(future.get());

    }
}
