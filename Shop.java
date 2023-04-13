package onlineShop;

import java.util.ArrayList;
import java.util.List;

/**
 * The Shop class is used to add <i><b>buyers</i></b> and <i><b>products</i></b> to shop<pre>
 *          - <i><b>add buyer</i></b> to buyer list
 *          - <i><b>get buyers list</i></b>
 *          - <i><b>add product</i></b> to product list
 *          - <i><b>get product list</i></b>
 *          - <i><b>display/print product list</i></b>
 * </pre>
 */

public class Shop {
    private List<Buyer> buyers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public void addBuyer(Buyer buyer){
        this.buyers.add(buyer);
    }

    public List<Buyer> getBuyerList(){
        return buyers;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public List<Product> getProductList(){
        return products;
    }

    public void displayProducts(){
        for (Product product: this.products) {
            System.out.println(product.getDescription() + "\t$" + product.getPrice());
        }
    }
}
