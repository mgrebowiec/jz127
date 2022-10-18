package sda.mg.jz127.thread.future;

import java.util.Random;
import java.util.concurrent.*;

public class FutureSample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> futureResult = executorService.submit(new MessageProducer());


//        System.out.println("Przed pobraniem wyniku poprzez metode get(), ktora wstrzymuje dzialanie watku main az do momemntu uzyskania rezultatu");
//        System.out.println(futureResult.get());
//        System.out.println("Po pobraniu wyniku");

        while (!futureResult.isDone()) {
            System.out.println("Czekamy na wynik dzialania watku reprezentowanego przez Future...");
        }
        System.out.println(futureResult.get());


        executorService.shutdown();

    }


    private static class MessageProducer implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(5*1000);
            Random random = new Random();
            return Thread.currentThread().getName() + " wyprodukowal wartosc: " + random.nextLong();
        }
    }
}
