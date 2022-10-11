package sda.mg.jz127.collectionsample.setsample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Michal");
        names.add("michal");
        names.add("MICHAL");
        names.add("michal");
        names.add("Michal");
        System.out.println("Zawartosc zbioru names:");
        for (String name : names) {
            System.out.println(name);
        }

        TreeSet<Integer> values = new TreeSet<>();
        values.add(1);
        values.add(4);
        values.add(2);
        values.add(3);
        values.add(5);
        values.add(3);
        values.add(1);
        values.add(3);
        Set<Integer> partOfValues = values.headSet(3);
        System.out.println("Zawartosc zbioru partOfValues:");
        for (Integer value : partOfValues) {
            System.out.println(value);
        }

        System.out.println("Zawartosc zbioru values:");
        for (Integer value : values) {
            System.out.println(value);
        }

        boolean removed = values.remove(Integer.valueOf(2));
        System.out.println("Czy element zostal usuniety: " + removed);

        removed = values.remove(Integer.valueOf(6));
        System.out.println("Czy element 6 zostal usuniety: " + removed);

        System.out.println("Zawartosc zbioru values po usunieciu elementu 2:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
