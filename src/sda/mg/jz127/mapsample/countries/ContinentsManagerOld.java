package sda.mg.jz127.mapsample.countries;

import java.util.*;

public class ContinentsManagerOld implements ContinentsManager {
    private Map<String, Set<String>> continents = new HashMap<>();

    public ContinentsManagerOld addCountry(String continent, String country) {
        if (continents.containsKey(continent)) {
            continents.get(continent).add(country);
        } else {
            Set<String> countriesOnContinent = new HashSet<>();
            countriesOnContinent.add(country);
            continents.put(continent, countriesOnContinent);
        }

        return this;
    }

    public void printAllCountriesOnContinent(String continent) {
        if (!continents.containsKey(continent)) {
            System.out.println("Nie istnieje kontynent: " + continent);
            return;
        }

        System.out.println("Kraje na kontynencie: " + continent);
        for (String country: continents.get(continent)) {
            System.out.println(country);
        }
    }

    public String findContinentForCountry(String country) {
        for (Map.Entry<String, Set<String>> pair : continents.entrySet()) {
            if (pair.getValue().contains(country)) {
                return pair.getKey();
            }
        }

        return null;
    }

    public Collection<String> getCountriesWithPrefix(String prefix) {
        Collection<String> resultCountries = new HashSet<>();

        Collection<Set<String>> allCountries = continents.values();
        for (Set<String> continentCountries : allCountries) {
            for (String country : continentCountries) {
                if (country.startsWith(prefix)) {
                    resultCountries.add(country);
                }
            }
        }

        return resultCountries;
    }

}
