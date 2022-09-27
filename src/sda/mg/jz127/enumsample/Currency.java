package sda.mg.jz127.enumsample;

public enum Currency {
    PLN("PLN", 0.01),
    USD("USD", 1.01),
    EUR("EUR", 0.99),
    GBP("GBP", 1.12);

    private final String code;
    private final double rate;

    Currency(String code, double rate) {
        this.code = code;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public String getCode() {
        return code;
    }

    public static Currency getFromCode(String code) {
        for (Currency currency : values()) {
            if (currency.getCode().equalsIgnoreCase(code)) {
                return currency;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return String.format("Currency{code:%s, rate:%f}", code, rate);
    }
}
