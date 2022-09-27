package sda.mg.jz127.enumsample;

public class ContinentMain {
    public static void main(String[] args) {
        Continent largestContinent = Continent.getLargest();
        System.out.println("Najwiekszy kontynet to: " + largestContinent.getName());

        Continent smallestContinent = Continent.getSmallest();
        System.out.println("Najmniejszy kontynent to: " + smallestContinent.getName());
    }
}
