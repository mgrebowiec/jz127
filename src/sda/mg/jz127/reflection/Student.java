package sda.mg.jz127.reflection;

import sda.mg.jz127.annotation.SampleAnnotation;

public class Student {
    private int age;

    public Student(int age) {
        this.age = age;
    }

    @SampleAnnotation(message = "test annotacji")
    public void restrictedMethod() {
        System.out.println("Wiek studenta: " + age);
    }
}
