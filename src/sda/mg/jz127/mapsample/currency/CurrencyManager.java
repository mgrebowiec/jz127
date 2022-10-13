package sda.mg.jz127.mapsample.currency;

import java.util.EnumMap;
import java.util.Map;

public class CurrencyManager {
    private Map<Currency, Double> currencyExchangeRates = new EnumMap<Currency, Double>(Currency.class);

    public CurrencyManager addCurrency(Currency currency, Double exchangeRate) {
        currencyExchangeRates.put(currency, exchangeRate);
        return this;
    }

    public Double getExchangeRate(Currency currency) {
        return currencyExchangeRates.get(currency);
    }
}
