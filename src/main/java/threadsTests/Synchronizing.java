package threadsTests;

import java.util.concurrent.Callable;

public class Synchronizing {
    public static void main(String[] args) throws Exception {
        Callable task = () -> {
            return "Hello World";
        };
        System.out.println(task.call());

    }
}
