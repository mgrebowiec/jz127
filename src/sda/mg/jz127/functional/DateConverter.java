package sda.mg.jz127.functional;

import java.time.LocalDate;

@FunctionalInterface
public interface DateConverter {
    LocalDate convert(int year, int month, int day);
}
