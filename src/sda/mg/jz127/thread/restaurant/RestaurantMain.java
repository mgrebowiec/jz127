package sda.mg.jz127.thread.restaurant;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Thread cook1 = new Cook(restaurant);
        Thread customer1 = new Customer(restaurant);

        cook1.start();
        customer1.start();
    }


    private static class Cook extends Thread {
        private final Restaurant restaurant;

        private Cook(Restaurant restaurant) {
            this.restaurant = restaurant;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    restaurant.prepareMeal();
                } catch (InterruptedException e) {
                    System.out.println("Wyjatek: " + e);
                    break;
                }
            }
        }
    }

    private static class Customer extends Thread {
        private final Restaurant restaurant;

        private Customer(Restaurant restaurant) {
            this.restaurant = restaurant;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    restaurant.consumeMeal();
                } catch (InterruptedException e) {
                    System.out.println("Wyjatek: " + e);
                    break;
                }
            }
        }
    }

}
