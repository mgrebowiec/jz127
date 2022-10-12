package sda.mg.jz127.collectionsample.zad2;

public class Cd extends AbstractProduct {
    public Cd(String name) {
        super(name);
    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.CD;
    }
}
