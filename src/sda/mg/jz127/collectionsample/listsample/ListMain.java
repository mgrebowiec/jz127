package sda.mg.jz127.collectionsample.listsample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Michal");
        names.add("michal");
        names.add("MICHAL");
        names.add("Michal");
        names.add("michal");
        names.add("MICHAL");

        printList(names, "Lista imion:");

        int index = names.indexOf("MICHAL");
        System.out.println("Index elementu MICHAL: " + index);

        names.remove(index);
        printList(names, "Lista imion po usunieciu elementu MICHAL:");

        names.remove("michal");
        printList(names, "Lista imion po usunieciu elementu michal:");

        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "Michal".equals(s);
            }
        });
        printList(names, "Lista imion po usunieciu elementu Michal(metoda removeIf):");

    }

    private static void printList(List<?> elements, String message) {
        System.out.println(message);
        for (Object o : elements) {
            System.out.println(o);
        }
    }
}
