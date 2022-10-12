package sda.mg.jz127.collectionsample.zad2;

import java.util.List;

public interface Basket {
    boolean addToBasket(Product product);
    Product removeFromBasket(String productId);
    List<Product> getAllProducts();
    int getQuantityForProduct(String productId);
}
