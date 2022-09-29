package sda.mg.jz127.ioexample.person;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PersonImporter {
    public Person[] importPersonsFromFile() {
        Person[] persons = new Person[100];
        try (FileReader fileReader = new FileReader("lista_osob.txt")) {
            Scanner in = new Scanner(fileReader);
            int personIndex = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] arguments = line.split(";");
                Person person = PersonFactory.createFromArguments(arguments);
                persons = addPerson(person, persons, personIndex);
                personIndex++;
            }
        } catch (IOException e) {
            System.out.println("Problem z plikiem: " + e.getMessage());
        }
        return persons;
    }

    private Person[] addPerson(Person person, Person[] persons, int personIndex) {
        if (persons.length - 1 <= personIndex) {
            // tworzymy tablice odpowiednio wieksza
            // przepisujemy do tej nowej tablicy dawne elementy
            Person[] newPersons = new Person[persons.length * 2];
            copyElements(persons, newPersons);
            newPersons[personIndex] = person;
            return newPersons;
        } else {
            persons[personIndex] = person;
            return persons;
        }
    }

    private void copyElements(Person[] from, Person[] to) {
        for (int index = 0; index < from.length; index++) {
            to[index] = from[index];
        }
    }
}
