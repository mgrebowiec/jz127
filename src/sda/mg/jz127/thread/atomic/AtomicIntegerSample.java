package sda.mg.jz127.thread.atomic;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerSample {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        List<Callable<Integer>> actions = Arrays.asList(
                () -> atomicInteger.addAndGet(1),
                () -> atomicInteger.incrementAndGet(),
                () -> atomicInteger.decrementAndGet()
        );

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        try {
            List<Future<Integer>> results = executorService.invokeAll(actions);
            for (Future<Integer> result : results) {
                System.out.println(result.get());
            }

            executorService.shutdown();
            System.out.println("Wynik: " + atomicInteger);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }

    }
}
