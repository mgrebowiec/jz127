package sda.mg.jz127.functional;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaFunctionalInterfaceMain {
    public static void main(String[] args) {
//        consumerSample();
//        predicateSample();
        supplierSample();
    }

    private static void supplierSample() {
        Supplier<Long> randomValueGenerator = () -> new Random().nextLong();
        System.out.println(randomValueGenerator.get());
        System.out.println(randomValueGenerator.get());
        System.out.println(randomValueGenerator.get());
        System.out.println(randomValueGenerator.get());
        System.out.println(randomValueGenerator.get());
    }

    private static void predicateSample() {
        Predicate<LocalDate> afterNow = (dateToTest) -> dateToTest.isAfter(LocalDate.now());
        System.out.println("Czy 2022-10-14 jest po aktualnym dniu: "
                + afterNow.test(LocalDate.of(2022, 10, 14)));

        System.out.println("Czy 2022-10-13 jest po aktualnym dniu: "
                + afterNow.test(LocalDate.of(2022, 10, 13)));

        System.out.println("Czy 2022-10-12 jest po aktualnym dniu: "
                + afterNow.test(LocalDate.of(2022, 10, 12)));
    }

    private static void consumerSample() {
        Consumer<String> consumer = (name) -> System.out.println("Przyklad konsumenta. Konsumuje wartosc: " + name);
        consumer.accept("Michal");
    }
}
