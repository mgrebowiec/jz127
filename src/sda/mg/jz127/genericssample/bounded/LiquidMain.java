package sda.mg.jz127.genericssample.bounded;

public class LiquidMain {
    public static void main(String[] args) {
        Cup<Coffee> coffeeCup = new Cup<>(new Coffee());
        coffeeCup.drink();

        Cup<Tea> teaCup = new Cup<>(new Tea());
        teaCup.drink();

        // Poniższy kod jest bledny ponieważ klasa String nie wywodzi się od klasy Liquid
//        Cup<String> stringCup = new Cup<String>("test");
    }
}
