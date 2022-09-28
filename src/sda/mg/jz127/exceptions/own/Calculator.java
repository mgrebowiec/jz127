package sda.mg.jz127.exceptions.own;

public class Calculator {

    static int divide(int a, int b) throws DoNotDivideByZeroException {
        if (b == 0) {
            throw new DoNotDivideByZeroException("Dzielnik ma wartosc 0! Nie mozna wykonac dzielenia.");
        }

        return a / b;
    }
}
