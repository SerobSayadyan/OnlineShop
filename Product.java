package onlineShop;

/**
 * The Product class specifies information about products of shop<pre>
 *            - get product ID
 *            - get/set product <i><b>name</b></i>
 *            - get/set product <i><b>description</i></b>
 *            - get/set product <i><b>price</i></b>
 *            - get/set product <i><b>stock</i></b></pre>
 */

public class Product {
    private static int productStaticID;
    private int productID;
    private String name;
    private String description;
    private double price;
    private int stock;

    public Product(String name, String description, double price, int stock) {
        this.productID = ++Product.productStaticID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getProductID() {
        return productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}