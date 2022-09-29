package sda.mg.jz127.ioexample.person;

public class PersonFactory {

    public static Person createFromArguments(String[] arguments) {
        String name = null;
        String surname = null;
        int age = -1;
        for (String argument: arguments) {
            String[] argumentValueAndName = argument.split("=");
            if ("imie".equals(argumentValueAndName[0])) {
                name = argumentValueAndName[1];
            }

            if ("nazwisko".equals(argumentValueAndName[0])) {
                surname = argumentValueAndName[1];
            }

            if ("wiek".equals(argumentValueAndName[0])) {
                age = Integer.parseInt(argumentValueAndName[1]);
            }
        }

        return new Person(name, surname, age);
    }
}
