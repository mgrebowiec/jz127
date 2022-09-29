package sda.mg.jz127.serialization;

import java.io.Serializable;

public class Human implements Serializable {
    private final String name;
    private final String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
