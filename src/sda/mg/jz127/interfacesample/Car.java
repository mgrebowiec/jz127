package sda.mg.jz127.interfacesample;

public interface Car {
    // każda deklaracja metody w interfejsie bez modyfikatorów jest publiczna i abstrakcyjna
    void run();

    default void blink() {
        System.out.println("... ... ...");
    }

}
