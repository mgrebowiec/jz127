package sda.mg.jz127.enumsample;

public class CarTypeMain {
    public static void main(String[] args) {
        CarType carType = CarType.HATCHBACK;
        Car car = new Car(carType);
    }

}

class Car {
    private final CarType carType;

    Car(CarType carType) {
        this.carType = carType;
    }

}
