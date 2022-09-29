package sda.mg.jz127.ioexample.person;

public class PersonMain {
    public static void main(String[] args) {
        PersonExporter personExporter = new PersonExporter();
        personExporter.exportToFile(
                new Person("michal", "grebowiec", 38),
                new Person("jan", "kowalski", 30),
                new Person("ala", "jakas", 21)
        );
    }
}
