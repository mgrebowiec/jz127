package sda.mg.jz127.mapsample.countries;

import java.util.Collection;

public interface ContinentsManager {
    void printAllCountriesOnContinent(String continent);

    String findContinentForCountry(String countryName);

    Collection<String> getCountriesWithPrefix(String prefix);
}
