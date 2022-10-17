package pl.sda.mg.modul2;

import pl.sda.mg.modul1.model.HelloSupplier;

public class Main {
    public static void main(String[] args) {
        HelloSupplier helloSupplier = new HelloSupplier();
        System.out.println("Hello world from module 2!: " + helloSupplier.get());
    }
}