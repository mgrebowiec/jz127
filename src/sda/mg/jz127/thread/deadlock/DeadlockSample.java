package sda.mg.jz127.thread.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSample {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        DeadlockSample deadlockSample = new DeadlockSample();
        Thread t1 = new Thread(deadlockSample::operation1, "T1");
        Thread t2 = new Thread(deadlockSample::operation2, "T2");

        t1.start();
        t2.start();
    }

    public void operation1() {
        lock1.lock();
        System.out.println("lock1 acquired");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("wyjatek przerwany");
        }

        lock2.lock();

        System.out.println("lock2 acquired");

        System.out.println("executing first operation.");

        lock2.unlock();
        lock1.unlock();
    }

    public void operation2() {
        lock2.lock(); // lock1.lock();
        System.out.println("lock2 acquired");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("wyjatek przerwany");
        }

        lock1.lock(); //lock2.lock();
        System.out.println("lock1 acquired");

        System.out.println("executing second operation.");
        lock1.unlock(); // lock2.unlock()
        lock2.unlock(); // lock1.unlock()
    }

}
