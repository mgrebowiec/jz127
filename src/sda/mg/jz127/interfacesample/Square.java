package sda.mg.jz127.interfacesample;

public class Square extends AbstractRectangular {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
