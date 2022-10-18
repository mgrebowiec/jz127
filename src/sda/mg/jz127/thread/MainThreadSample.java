package sda.mg.jz127.thread;

public class MainThreadSample {
    public static void main(String[] args) {
        SampleThread t1 = new SampleThread();
        Thread t2 = new SampleThread();
        Thread t3 = new Thread(new SampleRunnable());
        Thread t4 = new Thread(() -> System.out.println(Thread.currentThread().getName() + ":: wyrazenie lambda"));
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":: +++++++++++++++++++++++++");
                System.out.println(Thread.currentThread().getName() + ":: klasa anonimowa");
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            Thread.sleep(5 * 1000);
//            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(Thread.currentThread().getName() + "::main po wystartowaniu drugiego watku!");
    }
}
