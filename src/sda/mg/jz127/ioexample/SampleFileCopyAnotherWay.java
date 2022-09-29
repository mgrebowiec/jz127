package sda.mg.jz127.ioexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SampleFileCopyAnotherWay {
    public static void main(String[] args) {
        try (FileReader in = new FileReader("sample.xml");
             FileWriter out = new FileWriter("sample_copy_2.xml")
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            out.append("<koniec/>");
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Wyjatek w trakcie zamykania pliku..." + e.getMessage());
        }
    }
}
