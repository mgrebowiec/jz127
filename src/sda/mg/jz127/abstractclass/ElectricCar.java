package sda.mg.jz127.abstractclass;

class ElectricCar extends AbstractCar {
    @Override
    public void run() {
        System.out.println("Samochód elektryczny jedzie...");
    }

    public void charge() {
        System.out.println("Ladujemy samochod..." + name);
    }
}
