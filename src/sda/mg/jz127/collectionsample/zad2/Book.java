package sda.mg.jz127.collectionsample.zad2;

public class Book extends AbstractProduct {

    public Book(String name) {
        super(name);
    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.BOOK;
    }
}
