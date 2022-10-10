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

    public static <T> T[] swap(int firstIndex, int secondIndex, T... array) {
        if (array == null
                || firstIndex < 0 || firstIndex >= array.length
                || secondIndex < 0 || secondIndex >= array.length) {
            return array;
        }

        T tempElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempElement;
        return array;
    }

    public static <T> void print(T... array) {
        for (T e: array) {
            System.out.println(e);
        }
    }
}
