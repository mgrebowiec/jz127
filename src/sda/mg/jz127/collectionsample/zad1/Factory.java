package sda.mg.jz127.collectionsample.zad1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Factory {
    // stworz atrybut ktory bedzie przechowywal kolekcje ludzi (Human)
    private List<Human> workers = new ArrayList<>();

    // Utworz metode do dodawania ludzi do kolekcji
    public void addWorker(Human human) {
        workers.add(human);
    }

    public Factory addWorker(String name, String surname, int age, Sex sex) {
        workers.add(new Human(name, surname, age, sex));
        return this;
    }

    // Utworz metode do usuwania z kolekcji ludzi o zadanym wieku
    public void removeWorkersWithAge(int age) {
        Iterator<Human> workersIterator = workers.iterator();
        while (workersIterator.hasNext()) {
            Human worker = workersIterator.next();
            if (worker.getAge() == age) {
                workersIterator.remove();
            }
        }
    }

    // Utworz metode ktora zwroci nowa kolekcje ludzi o wskazanej płci
    public List<Human> getWorkersWithSex(Sex sex) {
        List<Human> result = new ArrayList<>();
        for (Human worker : workers) {
            if (worker.getSex() == sex) {
                result.add(worker);
            }
        }
        return result;
    }

    public void printWorkers() {
        printWorkers(workers);
    }

    public static void printWorkers(List<Human> humans) {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

}
