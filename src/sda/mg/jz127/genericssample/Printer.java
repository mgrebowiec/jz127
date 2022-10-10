package sda.mg.jz127.genericssample;

public class Printer<D> {
    private final D objectToPrint;

    public Printer(D objectToPrint) {
        this.objectToPrint = objectToPrint;
    }

    public void print() {
        System.out.println(objectToPrint);
    }

    public D getObjectToPrint() {
        return objectToPrint;
    }
}
