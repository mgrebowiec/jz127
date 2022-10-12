package sda.mg.jz127.collectionsample.zad2;

import java.util.List;

public interface Shop {
    List<Product> getAvailableProducts();
    void addProductToBasket(String productId) throws AddToBasketException;
    void removeProductFromBasket(String productId) throws RemoveProductException;
    void showBasket();
}
