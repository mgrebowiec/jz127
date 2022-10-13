package sda.mg.jz127.mapsample.currency;

public class CurrencyMain {
    public static void main(String[] args) {
        CurrencyManager currencyManager = new CurrencyManager();
        currencyManager.addCurrency(Currency.PLN, 0.003)
                .addCurrency(Currency.EUR, 0.1)
                .addCurrency(Currency.USD, 0.11);


        System.out.println("Wspolczynnik wymiany dla PLN: " + currencyManager.getExchangeRate(Currency.PLN));
    }
}
