package sda.mg.jz127.genericssample.bounded;

public class ComparatorUtil {

    public static <T extends Comparable<T>> boolean isGreater(T first, T second) {
        return first.compareTo(second) > 0;
    }
}
