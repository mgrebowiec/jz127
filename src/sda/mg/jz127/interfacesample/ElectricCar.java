package sda.mg.jz127.interfacesample;

class ElectricCar implements Car {
    @Override
    public void run() {
        System.out.println("Samohod elektryczny jedzie...");
    }

    public void charge() {
        System.out.println("Laduje samochod......");
    }
}
