package sda.mg.jz127.collectionsample.zad2;

import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        // Utworzyć obiekt typu Shop
        // pobrać listę dostępnych produktów
        // wziąć ostatni produkt z tej listy i dodać go do koszyka dwa razy
        // wyświetlić zawartość koszyka
        // usunąć produkt z koszyka
        // wyświetlić zawartość koszyka
        Shop shop = createShopWithProducts();
        List<Product> availableProducts = shop.getAvailableProducts();
        String productId = availableProducts.get(availableProducts.size() - 1).getProductId();
        try {
            shop.addProductToBasket(productId);
            shop.addProductToBasket(productId);

            shop.showBasket();

            shop.removeProductFromBasket(productId);

            shop.showBasket();
        } catch (AddToBasketException | RemoveProductException e) {
            System.out.println(e.getMessage());
        }

    }

    private static Shop createShopWithProducts() {
        ShopImpl shop = new ShopImpl();
        shop.addAvailableProduct("harry potter", ProductCategory.BOOK)
                .addAvailableProduct("kult", ProductCategory.CD)
                .addAvailableProduct("IBM", ProductCategory.COMPUTER)
                .addAvailableProduct("007", ProductCategory.BOOK)
                .addAvailableProduct("Lenovo", ProductCategory.COMPUTER);
        return shop;
    }
}
