package sda.mg.jz127.exceptions;

import javax.naming.OperationNotSupportedException;
import java.rmi.NotBoundException;
import java.text.ParseException;

public class CheckedExceptionMain {
    public static void main(String[] args) {

        try {
            CheckedExceptionMain.helloWithException();
        } catch (ParseException | NotBoundException e) {
            System.out.println("Wystapil blad");
//            throw new RuntimeException(e);
        }
    }

    static void helloWithException() throws ParseException, NotBoundException {

        throw new ParseException("aaaaa", 0);

        // Rzucamy wyjatek z grupy unczecked (poniewaz dziedziczy po RuntimeException)
//        throw new UnsupportedOperationException();
    }
}
