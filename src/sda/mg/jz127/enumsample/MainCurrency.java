package sda.mg.jz127.enumsample;

public class MainCurrency {
    public static void main(String[] args) {
        Currency pln = Currency.getFromCode("pln");
        System.out.println(pln);

        System.out.println("Wszystkie wartosci typu wyliczeniowego Currency:");
        Currency[] currencies = Currency.values();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        // Nie możemy tworzyć nowych obiektów stosując typ wyliczeniowy
//        Currency gbp = new Currency("GBP", 1);

        System.out.println("Pobieramy funta przez stala");
        Currency gbp = Currency.GBP;
        System.out.println(gbp);

    }
}
