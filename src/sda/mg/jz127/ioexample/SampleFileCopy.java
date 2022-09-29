package sda.mg.jz127.ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SampleFileCopy {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("sample.xml");
            out = new FileOutputStream("sample_copy.xml");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Blad podczas przetwarzania pliku: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Wyjatek w trakcie zamykania pliku wejsciowego...");
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Wyjatek w trakcie zamykania pliku wyjsciowego...");
                }
            }
        }

    }

    public static void copyFileUsingTryWithResource() {
        try (FileInputStream in = new FileInputStream("sample.xml");
             FileOutputStream out = new FileOutputStream("sample_copy.xml")
        ) {

            // Mozecie używać klasy Scanner do operacji na pliku wejściowym
//            Scanner sin = new Scanner(in);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Wyjatek w trakcie zamykania pliku..." + e.getMessage());
        }


    }

}
