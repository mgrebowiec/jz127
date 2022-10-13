package sda.mg.jz127.mapsample.countries;

import java.util.*;

public class ContinentsManagerNew implements ContinentsManager {
    private Map<String, Set<Country>> continents = new HashMap<>();

    public ContinentsManagerNew addCountry(String continent, Country country) {
        if (continents.containsKey(continent)) {
            continents.get(continent).add(country);
        } else {
            Set<Country> countriesOnContinent = new HashSet<>();
            countriesOnContinent.add(country);
            continents.put(continent, countriesOnContinent);
        }

        return this;
    }

    @Override
    public void printAllCountriesOnContinent(String continent) {
        if (!continents.containsKey(continent)) {
            System.out.println("Nie istnieje kontynent: " + continent);
            return;
        }

        System.out.println("Kraje na kontynencie: " + continent);
        for (Country country: continents.get(continent)) {
            System.out.println(country);
        }
    }

    @Override
    public String findContinentForCountry(String countryName) {
        for (Map.Entry<String, Set<Country>> pair : continents.entrySet()) {
            Set<Country> countries = pair.getValue();
            for (Country country : countries) {
                if (country.getName().equals(countryName)) {
                    return pair.getKey();
                }
            }
        }

        return null;
    }

    @Override
    public Collection<String> getCountriesWithPrefix(String prefix) {
        Collection<String> resultCountries = new HashSet<>();

        Collection<Set<Country>> allCountries = continents.values();
        for (Set<Country> continentCountries : allCountries) {
            for (Country country : continentCountries) {
                if (country.getName().startsWith(prefix)) {
                    resultCountries.add(country.getName());
                }
            }
        }

        return resultCountries;
    }

}
