package sda.mg.jz127.exceptions;

public class Main {

    public static void main(String[] args) {
        String[] array = new String[2];
        try {
            System.out.printf("Value at index 3: %d\n",array[array.length]);
            System.out.println("wynik dzielenia przez 0: " + 10 / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Wystapil blad: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Obslugujemy cala grupe wyjatkow RuntimeException!!! ");
        } catch (Exception e) {
            System.out.println("Obslugujemy cala grupe wyjatkow Exception!!! To powinno byc jako ostatni blok");
        } finally {
            System.out.println("Jestesmy w bloku finally, ktory wykona sie zawsze jako ostatni");
        }



        System.out.println("Po wyjsciu z obslugi wyjatkow!");
    }
}
