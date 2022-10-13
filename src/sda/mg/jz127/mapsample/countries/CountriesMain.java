package sda.mg.jz127.mapsample.countries;

import sda.mg.jz127.mapsample.currency.Currency;

public class CountriesMain {
    public static void main(String[] args) {
//        ContinentsManager continentsManager = createOldOne();
        ContinentsManager continentsManager = createNewOne();
        checkContinentsManager(continentsManager);
    }

    private static void checkContinentsManager(ContinentsManager continentsManager) {
        continentsManager.printAllCountriesOnContinent("EUROPA");
        continentsManager.printAllCountriesOnContinent("AMERYKA N");
        continentsManager.printAllCountriesOnContinent("yeti");

        System.out.println(continentsManager.getCountriesWithPrefix("P"));

        System.out.println("Gdzie lezy Anglia? " + continentsManager.findContinentForCountry("Anglia"));
    }

    private static ContinentsManager createOldOne() {
        ContinentsManagerOld continentsManagerOld = new ContinentsManagerOld();
        continentsManagerOld.addCountry("EUROPA", "Polska")
                .addCountry("EUROPA", "Niemcy")
                .addCountry("EUROPA", "Anglia")
                .addCountry("AMERYKA N", "USA")
                .addCountry("AMERYKA N", "Kanada")
                .addCountry("AZJA", "Pakistan");
        return continentsManagerOld;
    }

    private static ContinentsManager createNewOne() {
        ContinentsManagerNew continentsManagerNew = new ContinentsManagerNew();
        continentsManagerNew.addCountry("EUROPA", new Country(Currency.PLN,"Polska"))
                .addCountry("EUROPA", new Country(Currency.EUR,"Niemcy"))
                .addCountry("EUROPA", new Country(Currency.EUR,"Anglia"))
                .addCountry("AMERYKA N", new Country(Currency.USD,"USA"))
                .addCountry("AMERYKA N", new Country(Currency.USD,"Kanada"))
                .addCountry("AZJA", new Country(Currency.PLN,"Pakistan"));

        return continentsManagerNew;
    }
}
