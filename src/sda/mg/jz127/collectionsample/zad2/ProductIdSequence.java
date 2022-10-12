package sda.mg.jz127.collectionsample.zad2;

public class ProductIdSequence {
    private static int productIdSequence = 0;

    static int generateProductId() {
        return productIdSequence++;
    }
}
