package sda.mg.jz127.functional;

import java.time.LocalDate;

@FunctionalInterface
public interface CurrentDateRetrieval {
    LocalDate getCurrent();
}
