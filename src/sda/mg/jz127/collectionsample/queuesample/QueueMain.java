package sda.mg.jz127.collectionsample.queuesample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("michal");
        names.offer("jan");
        names.offer("magda");

        String name = names.peek();
        System.out.println("Pobrane imie przez peek(): " + name);

        names.offer("zosia");

        name = names.peek();
        System.out.println("Pobrane imie przez peek(): " + name);

        name = names.poll();
        System.out.println("Pobrane imie przez poll(): " + name);

        name = names.peek();
        System.out.println("Pobrane imie przez peek(): " + name);

        name = names.poll();
        System.out.println("Pobrane imie przez poll(): " + name);

        System.out.println("Rozmiar finalny: " + names.size());

    }
}
