package sda.mg.jz127.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        Optional<String> question = Optional.empty();
//        Optional<String> question = Optional.of("czy dzisiaj jest ladna pogoda?");
//        Optional<String> question = Optional.of(null); // rzuci wyjatek poniewaz przekazalismy nie istniejacy obiekt
//        Optional<String> question = Optional.ofNullable(null); // wyjatek nie poleci - prawidlowa sytuacja
        Optional<String> question = Optional.ofNullable("czy dzisiaj padal deszcz?");

        if (question.isEmpty()) {
            System.out.println("pytanie jest puste");
        } else {
            System.out.println("pytanie zawiera konkretna wartosc: " + question.get());
        }

        question = question.filter((txt) -> txt.contains("?"));

        // Consumer wyrazimy przez method reference
        // void	accept(T t)
//        question.ifPresent((txt) -> System.out.println(txt));
        question.ifPresent(System.out::println);

        // Function<? super T, ? extends U> mapper
        question = question.map((input) -> " - " + input);
        System.out.println("Po mapowaniu: " + question.orElse("brak pytania"));


        question = Optional.empty();
        System.out.println("Wartość: " + question.orElseThrow(() -> new UnsupportedOperationException("brak pytania")));

    }


    // Raczej odradza się stosować typu Optional jako parametrow wejsciowych
    private static void makeSth(Optional<String> question) {
        if (question == null) {
            return;
        }

        if (!question.isPresent()) {
            return;
        }

        System.out.println(question.get());
    }

    private static Optional<String> makeSth(String question) {
        return Optional.ofNullable(question);
    }
}
