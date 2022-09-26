package sda.mg.jz127.interfacesample;

public class MainFigure {
    public static void main(String[] args) {
        Figure square = new Square(2);
        Figure rectangular = new Rectangular(2, 3);

        square.printArea();
        rectangular.printArea();
    }
}
