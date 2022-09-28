package sda.mg.jz127.exceptions.own;

public class Main {
    public static void main(String[] args) {

        try {
            divide();
        } catch (DoNotDivideByZeroException e) {
            System.out.println(e.getMessage());
        }

        Currency currency = Currency.fromCode("gbp");
    }


    private static int divide() throws DoNotDivideByZeroException {
        return Calculator.divide(10, 0);
    }
}
