package sda.mg.jz127.collectionsample.zad1;

import java.util.Objects;

public class Human {
    private final String name;
    private final String surname;
    private final int age;
    private final Sex sex;

    public Human(String name, String surname, int age, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && name.equals(human.name) && surname.equals(human.surname) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, sex);
    }
}
