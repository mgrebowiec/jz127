package sda.mg.jz127.genericssample;

public class CupMaker {

    // Metoda generyczna
    public <T> Cup<T> make(T liquid) {
        return new Cup<>(liquid);
    }
}
