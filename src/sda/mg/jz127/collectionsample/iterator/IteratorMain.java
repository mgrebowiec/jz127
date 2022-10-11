package sda.mg.jz127.collectionsample.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        iterateAndRemoveUsingIterator();

        // zle zrobiony kod - tak nie robić!!!
        iterateAndRemoveUsingForEach();
    }

    private static void iterateAndRemoveUsingIterator() {
        List<String> names = new ArrayList<>();
        names.add("Michal");
        names.add("Jan");
        names.add("Magda");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            if (name.contains("n")) {
                namesIterator.remove();
            }
        }

        System.out.println("Rozmiar listy: " + names.size());
    }


    private static void iterateAndRemoveUsingForEach() {
        List<String> names = new ArrayList<>();
        names.add("Michal");
        names.add("Jan");
        names.add("Magda");
        names.add("Magda2");

        // Jak usuwamy elemnty kolekcji podczas iteracji to nie robimy tego w pętli for! Używamy w tym celu Iteratora.
        for (String name : names) {
            System.out.println(name);
            if (name.contains("n")) {
                names.remove(name);
                printList(names, "Po usunieciu");
            }
        }

        System.out.println("Rozmiar listy: " + names.size());
    }

    private static void printList(List<?> elements, String message) {
        System.out.println(message);
        for (Object o : elements) {
            System.out.println(o);
        }
    }
}
