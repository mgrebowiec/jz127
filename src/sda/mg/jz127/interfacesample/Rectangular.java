package sda.mg.jz127.interfacesample;

public class Rectangular extends AbstractRectangular {
    private final double a;
    private final double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
