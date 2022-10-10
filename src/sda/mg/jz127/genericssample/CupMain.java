package sda.mg.jz127.genericssample;

public class CupMain {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Cup<Tea> teaCup = new Cup<Tea>(tea);
        // Poniżej forma uproszczona - rekomendowana
//        Cup<Tea> teaCup = new Cup<>(tea);
        teaCup.drink();

        Coffee coffee = new Coffee();
        Cup<Coffee> coffeeCup = new Cup<>(coffee);
        coffeeCup.drink();

        Cup<String> stringCup = new Cup<>("Bzdurny tekst");
        stringCup.drink();

    }
}
