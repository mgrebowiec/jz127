package sda.mg.jz127.interfacesample;

public class MainFigure {
    public static void main(String[] args) {
        Figure square = new Square(2);
        Figure rectangular = new Rectangular(2, 3);
        double r = 9;
        // tworzenie klasy anonimowej na podstawie interfejsu Figure
        Figure oval = new Figure() {
            @Override
            public double getArea() {
                return Math.PI * r * r;
            }

            @Override
            public void print() {
                printArea();
            }
        };

        square.printArea();
        rectangular.printArea();
        oval.printArea();


    }
}
