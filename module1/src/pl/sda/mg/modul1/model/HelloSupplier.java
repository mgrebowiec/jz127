package pl.sda.mg.modul1.model;

import java.util.function.Supplier;

public class HelloSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "jakas wartosc";
    }
}
