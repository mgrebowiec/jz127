package sda.mg.jz127.collectionsample.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class BasketImpl implements Basket {
    private List<Product> products = new ArrayList<>();

    @Override
    public boolean addToBasket(Product product) {
        return products.add(product);
    }

    @Override
    public Product removeFromBasket(String productId) {
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getProductId().equals(productId)) {
                productIterator.remove();
                return product;
            }
        }

        return null;

//        products.removeIf(new Predicate<Product>() {
//            @Override
//            public boolean test(Product product) {
//                return product.getProductId().equals(productId);
//            }
//        });
    }

    @Override
    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
//        return new ArrayList<>(products);
    }

    @Override
    public int getQuantityForProduct(String productId) {
        int quantity = 0;
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public String toString() {
        return "Lsta produktow w koszyku: {" +
                "products=" + products +
                '}';
    }
}
