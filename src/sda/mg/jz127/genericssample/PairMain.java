package sda.mg.jz127.genericssample;

import sda.mg.jz127.interfacesample.Car;
import sda.mg.jz127.interfacesample.DefaultCar;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, Car> polonez = new Pair<>("Polonez", new DefaultCar());
        System.out.println("Nazwa samochodu: " + polonez.getFirst()
                + ". Informacje o samochodzie: " + polonez.getSecond().toString());

    }
}
