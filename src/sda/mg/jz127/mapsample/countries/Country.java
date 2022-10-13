package sda.mg.jz127.mapsample.countries;

import sda.mg.jz127.mapsample.currency.Currency;

public class Country {
    private final Currency currency;
    private final String name;

    public Country(Currency currency, String name) {
        this.currency = currency;
        this.name = name;
    }


    public Currency getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "currency=" + currency +
                ", name='" + name + '\'' +
                '}';
    }
}
