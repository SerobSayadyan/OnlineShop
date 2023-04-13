package onlineShop;

/**
 * The MainOfShop class is used to coordinate the shop and is the main class it
 */

public class MainOfShop {
    public static void main(String[] args) {
        Product product1 = new Product("Snickers", "candy", 4.99, 5);
        Product product2 = new Product("Beacon", "salami", 9.99, 10);
        Product product3 = new Product("Coca Cola 1l", "soft drink", 2.99, 20);

        Shop shop = new Shop();
        shop.addBuyer(new Buyer("John", "Smith"));
        shop.addBuyer(new Buyer("Michael", "Stewart"));

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product1);

        for (Product product : shop.getProductList()) {
            System.out.println(product.getProductID() + " " + product.getName() + " " +
                    product.getDescription() + " $" + product.getPrice() + " stock:" + product.getStock());
        }

        System.out.println("The total price is - $" + shop.getBuyerList().get(1).getShoppingCart().getTotalPrice());
    }
}
