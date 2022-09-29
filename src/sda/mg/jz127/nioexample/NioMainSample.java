package sda.mg.jz127.nioexample;

import java.io.IOException;
import java.nio.file.*;

public class NioMainSample {
    public static void main(String[] args) {
        Path path = Paths.get("lista_osob.txt");
        Path output = Paths.get("sample_nio.txt");
        try {
            for (String line : Files.readAllLines(path)) {
                System.out.println(line);
            }

            Files.writeString(output, "Pierwsza linia tekstu");
            Files.writeString(output, "\nDruga linia tekstu", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
