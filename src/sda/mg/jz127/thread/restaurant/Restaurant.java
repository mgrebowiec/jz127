package sda.mg.jz127.thread.restaurant;

public class Restaurant {
    private boolean isMealReady = false;

    public synchronized void consumeMeal() throws InterruptedException {
        while (!isMealReady) {
            wait();
        }

        System.out.println(Thread.currentThread().getName() + " is consuming meal!");
        isMealReady = false;
        notifyAll();
    }

    public synchronized void prepareMeal() throws InterruptedException {
        while (isMealReady) {
            wait();
        }
        isMealReady = true;
        System.out.println(Thread.currentThread().getName() + " prepared meal!");
        notifyAll();
    }


}
