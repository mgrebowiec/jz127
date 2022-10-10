package sda.mg.jz127.genericssample;

public class MainConverter {
    public static void main(String[] args) {
        Converter<String, String> stringConverter = new Converter<>();
        String resultString = stringConverter.convert("jakis");

        Converter<String, Integer> stringToIntegerConverter = new Converter<>();
        Integer resultInteger = stringToIntegerConverter.convert("1");
    }
}
