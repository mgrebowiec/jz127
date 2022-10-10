package sda.mg.jz127.genericssample.bounded;

public class ComparatorUtilMain {
    public static void main(String[] args) {
        System.out.printf("Czy liczba 2 jest wieksza niz 2: %b\n", ComparatorUtil.isGreater(2, 2));
        System.out.printf("Czy c jest wieksza niz b: %b\n", ComparatorUtil.isGreater("c", "b"));
    }
}
