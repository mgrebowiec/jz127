package sda.mg.jz127.ioexample.person;

import java.io.FileWriter;
import java.io.IOException;

public class PersonExporter {
    public void exportToFile(Person ... persons) {
        try (FileWriter out = new FileWriter("lista_osob.txt")) {
            for (Person person: persons) {
                out.append(person.getDetails()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Problem z obsluga pliku: " + e.getMessage());
        }
    }
}
