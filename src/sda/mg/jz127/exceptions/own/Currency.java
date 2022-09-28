package sda.mg.jz127.exceptions.own;

public enum Currency {
    PLN,
    EUR,
    USD;

    public static Currency fromCode(String code) {
        for (Currency currency : values()) {
            if (currency.name().equalsIgnoreCase(code)) {
                return currency;
            }
        }

        throw new NotSupportedCurrency("Nie istnieje waluta o kodzie: " + code);
    }
}
