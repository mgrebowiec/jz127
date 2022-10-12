package sda.mg.jz127.collectionsample.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ShopImpl implements Shop {
    private List<Product> products = new ArrayList<>();

    private Basket basket = new BasketImpl();

    ShopImpl addAvailableProduct(String productName, ProductCategory productCategory) {
        switch (productCategory) {
            case CD:
                products.add(new Cd(productName));
                break;
            case BOOK:
                products.add(new Book(productName));
                break;
            case COMPUTER:
                products.add(new Computer(productName));
                break;
        }

        return this;
    }

    @Override
    public List<Product> getAvailableProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public void addProductToBasket(String productId) throws AddToBasketException {
        Product productToAdd = getProductWithId(productId);
        if (productToAdd == null) {
            throw new AddToBasketException("Nie mozemy dodac do koszyka produktu o nie istniejacym Id: " + productId);
        }

        basket.addToBasket(productToAdd);
    }

    @Override
    public void removeProductFromBasket(String productId) throws RemoveProductException {
        Product removedProduct = basket.removeFromBasket(productId);
        if (removedProduct == null) {
            throw new RemoveProductException("Nie mozna usunac z koszyka produktu o identyfikatorze " + productId);
        }
    }

    @Override
    public void showBasket() {
        System.out.println(basket);
    }

    private Product getProductWithId(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }

        return null;
    }
}
