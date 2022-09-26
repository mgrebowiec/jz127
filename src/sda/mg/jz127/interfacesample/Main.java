package sda.mg.jz127.interfacesample;

public class Main {
    public static void main(String[] args) {
        // Nie można tworzyć obiektów tylko z definicji interfejsu.
//        Car car = new Car();

        Car electricCar = new ElectricCar();
        Car defaultCar = new DefaultCar();

        ElectricCar electricCar1 = new ElectricCar();
        DefaultCar defaultCar1 = new DefaultCar();

        electricCar1.run();
        electricCar1.charge();
        electricCar1.blink();

        electricCar.blink();
        electricCar.run();
        // metoda charge jest zdefiniowana tylko w klasie ElectricCar.
//        electricCar.charge();

        ((ElectricCar) electricCar).charge();

    }
}
