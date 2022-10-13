package sda.mg.jz127.functional;

import java.time.LocalDate;

public class PresenterMain {
    public static void main(String[] args) {
//        presenterSample();
//        helloWorldSample();
//        personSample();
//        currentDateRetrieval();
//        dateConverter();
        multiLineExample();
    }

    private static void multiLineExample() {
        MultiLineExample e = new MultiLineExample() {
            @Override
            public String concat(String text, int value, int valueToAdd) {
                LocalDate now = LocalDate.now();
                String msg = "Aktualna data: " + now;
                value = value + valueToAdd;
                return msg + " wynik dzialania: " + value;
            }
        };
        String message = e.concat("Hello", 1, 34);
        System.out.println(message);

        MultiLineExample e1 = (text, value, valueToAdd) -> {
            LocalDate now = LocalDate.now();
            String msg = "Aktualna data: " + now;
            value = value + valueToAdd;
            return msg + " wynik dzialania: " + value;
        };

        message = e1.concat("Hello", 1, 34);
        System.out.println(message);

    }

    private static void dateConverter() {
        DateConverter dc = new DateConverter() {
            @Override
            public LocalDate convert(int year, int month, int day) {
                return LocalDate.of(year, month, day);
            }
        };
        LocalDate date = dc.convert(2022, 10, 13);
        System.out.println(date);

        DateConverter dc1 = (year, month, day) -> LocalDate.of(year, month, day);
        date = dc1.convert(2022, 10, 13);
        System.out.println(date);
    }

    private static void currentDateRetrieval() {
        CurrentDateRetrieval cdr = new CurrentDateRetrieval() {
            @Override
            public LocalDate getCurrent() {
                return LocalDate.now();
            }
        };
        LocalDate now = cdr.getCurrent();
        System.out.println(now);

        CurrentDateRetrieval cdr1 = () -> LocalDate.now();
        now = cdr1.getCurrent();
        System.out.println(now);
    }

    private static void personSample() {
        Person p = new Person() {
            @Override
            public void showDetails(String name, int age) {
                System.out.printf("Osoba ma imie: %s i jest w wieku: %d\n", name, age);
            }
        };
        p.showDetails("Michal", 35);

        Person p1 = (name, age) -> System.out.printf("Osoba ma imie: %s i jest w wieku: %d\n", name, age);
        p1.showDetails("Michal", 35);
    }

    private static void helloWorldSample() {
        HelloWorld h = new HelloWorld() {
            @Override
            public void hello() {
                System.out.println("Hello world!");
            }
        };
        h.hello();

        HelloWorld h1 = () -> System.out.println("Hello world!");
        h1.hello();
    }


    private static void presenterSample() {
        Presenter p = new Presenter() {
            @Override
            public void show(String text) {
                System.out.println("Hello: " + text);
            }
        };
        p.show("Michal");


        Presenter p1 = (t) -> System.out.println("Hello: " + t);
        p1.show("Michal");
    }
}
