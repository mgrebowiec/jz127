package sda.mg.jz127.abstractclass;

public class Main {
    public static void main(String[] args) {
        // Nie można tworzyć obiektów na podstawie klas abstrakcyjnych.
//        AbstractCar abstractCar = new AbstractCar();

        // Typ zmiennej może być klasą abstrakcyjną ale tworzenie obiektu musi być na podstawie definicji klasy nieabstrakcyjnej
        // Typ zmiennej może być wyrażony przez klasę nadrzędną (abstrakcyjną) lub przez klasę której definicję wykorzystujemy do utworzenia obiektu (ElectricCar)
        AbstractCar electricCar = new ElectricCar();
        AbstractCar defaultCar = new DefaultCar();

        ElectricCar electricCar1 = new ElectricCar();
        DefaultCar defaultCar1 = new DefaultCar();

        // Ponieważ zmienna electricCar1 jest typu ElectricCar i tylko tam została utworzona metoda charge,
        // to tylko na tym typie mamy do niej dostęp
        electricCar1.charge();
        electricCar1.run();
        electricCar1.blink();

        electricCar.blink();
        electricCar.run();
//        electricCar.charge();

        ((ElectricCar)electricCar).charge();
        // Poniższy kod wywoła błąd w działaniu programu ponieważ obiekt został
        // utworzony za pomocą konstruktora klasy ElectricCar
//        ((DefaultCar)electricCar).run();
    }
}
