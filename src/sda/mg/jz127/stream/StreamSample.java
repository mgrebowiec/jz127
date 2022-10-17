package sda.mg.jz127.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSample {
    public static void main(String[] args) {
        Stream<String> sample = Stream.of("jeden", "2", "3", "10", "4", "5", "01");
        sample.filter((txt) -> {
            try {
                Integer.parseInt(txt);
                return true;
            } catch (Exception ignored) {
                return false;
            }
        })
                .map((txt) -> Integer.valueOf(txt))
                .sorted(Comparator.reverseOrder())
                .forEach((txt) -> System.out.println(txt));
    }
}
