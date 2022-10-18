package sda.mg.jz127.thread;

public class SampleRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "::=============");
        System.out.println(Thread.currentThread().getName() + "::Testujemy Runnable!");
    }
}
