package sda.mg.jz127.collectionsample.zad2;

public class Computer extends AbstractProduct {
    public Computer(String name) {
        super(name);
    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.COMPUTER;
    }
}
