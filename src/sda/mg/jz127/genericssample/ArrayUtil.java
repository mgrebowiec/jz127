package sda.mg.jz127.genericssample;

public class ArrayUtil {

    public static <T> boolean isContainElement(T element, T... array) {
        if (array == null) {
            return false;
        }

        for (T e: array) {
            if (e.equals(element)) {
                return true;
            }
        }

        return false;
    }
}
