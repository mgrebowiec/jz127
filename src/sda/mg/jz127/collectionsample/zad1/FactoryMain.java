package sda.mg.jz127.collectionsample.zad1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FactoryMain {
    public static void main(String[] args) {
//        factoryExample();
        exampleOfEqualsMethodAndSet();
    }

    private static void factoryExample() {
        Factory factory = new Factory();
        factory.addWorker("jan", "kowalski", 29, Sex.MALE)
                .addWorker("michal", "grebowiec", 31, Sex.MALE)
                .addWorker("magda", "jaworowicz", 29, Sex.FEMALE);

        factory.addWorker(new Human("ewelina", "jedrasik", 32, Sex.FEMALE));
        factory.addWorker(new Human("ala", "makota", 28, Sex.FEMALE));

        System.out.println("Wszyscy pracownicy naszej fabryki:");
        factory.printWorkers();

        List<Human> mens = factory.getWorkersWithSex(Sex.MALE);
        System.out.println("Wszyscy faceci:");
        Factory.printWorkers(mens);

        List<Human> womens = factory.getWorkersWithSex(Sex.FEMALE);
        System.out.println("Wszystkie kobiety:");
        Factory.printWorkers(womens);

        System.out.println("Pracownicy po usunieciu ludzi w wieku 29 lat:");
        factory.removeWorkersWithAge(29);
        factory.printWorkers();
    }

    private static void exampleOfEqualsMethodAndSet() {
        Set<Human> humans = new HashSet<>();
        Human human1 = new Human("michal", "grebowiec", 12, Sex.MALE);
        Human human2 = new Human("michal", "grebowiec", 12, Sex.MALE);
        humans.add(human1);
        humans.add(human2);

        System.out.println("Rozmiar: " + humans.size());
    }
}
