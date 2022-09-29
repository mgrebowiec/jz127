package sda.mg.jz127.ioexample.person;

public class PersonImportMain {
    public static void main(String[] args) {
        PersonImporter importer = new PersonImporter();
        Person[] persons = importer.importPersonsFromFile();
        for (Person person: persons) {
            System.out.println(person);
        }
    }
}
