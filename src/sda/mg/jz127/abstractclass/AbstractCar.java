package sda.mg.jz127.abstractclass;

public abstract class AbstractCar {

    protected String name;

    public abstract void run();

    public void blink() {
        System.out.println("... ... ...");
    }
}
