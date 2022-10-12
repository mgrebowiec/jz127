package sda.mg.jz127.collectionsample.zad2;

public abstract class AbstractProduct implements Product {
    private final String name;
    private final String productId;

    public AbstractProduct(String name) {
        this.name = name;
        this.productId = String.valueOf(ProductIdSequence.generateProductId());
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId='" + productId + '\'' +
                ", category='" + getProductCategory() + '\'' +
                '}';
    }
}
