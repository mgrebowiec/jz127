package sda.mg.jz127.collectionsample.zad1;

import java.util.List;

public class FactoryMain {
    public static void main(String[] args) {
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
}
