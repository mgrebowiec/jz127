package sda.mg.jz127.collectionsample.zad1;

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
}
