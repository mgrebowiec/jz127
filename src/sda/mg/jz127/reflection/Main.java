package sda.mg.jz127.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Method[] methods = Student.class.getMethods();
        for (Method method: methods) {
//            method.
            System.out.println(method.getName());
            if (method.getName().equals("restrictedMethod")) {
                System.out.println("Annotacje na metodzie restrictedMethod:");
                for (Annotation annotation: method.getAnnotations()) {
                    System.out.println(annotation);
                }
            }

        }

        System.out.println("Lista annotacji:");
        Annotation[] annotations = Student.class.getAnnotations();
        for (Annotation annotation: annotations) {
            System.out.println(annotation);
        }

        System.out.println("Lista konstruktorow:");
        for (Constructor constructor: Student.class.getConstructors()) {
            System.out.println(constructor);
            Student student = (Student) constructor.newInstance(10);
            student.restrictedMethod();
        }
    }
}
