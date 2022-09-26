package sda.mg.jz127.interfacesample;

public interface Figure {
    double getArea();

    default void printArea() {
        System.out.println("Pole powierzchni: " + getArea());
    }
}
