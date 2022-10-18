package sda.mg.jz127.thread;

public class SampleThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "::---------------");
        System.out.println(Thread.currentThread().getName() + "::Testujemy nasz pierwszy watek!");
    }
}
