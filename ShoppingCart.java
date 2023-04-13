package onlineShop;

import java.util.ArrayList;
import java.util.List;

/**
 * The ShoppingCart class is used to <i><b>add</i></b>, <i><b>remove</i></b>,
 * <i><b>update the quantity</i></b> and <i><b>get total price</i></b> of you shopping items
 */

public class ShoppingCart {
    List<ShoppingCartItem> items = new ArrayList<>();
    public void addItem(Product product, int quantity){
        for (ShoppingCartItem item : items){
            if (item.getProduct().getProductID() == product.getProductID()){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new ShoppingCartItem(product, quantity));
    }
    public void removeItem(Product product){
        for (ShoppingCartItem item : items) {
            if (item.getProduct().getProductID() == product.getProductID()){
                items.remove(item);
                return;
            }
        }
    }
    public void updateItemQuantity(Product product, int quantity){
        for (ShoppingCartItem item : items) {
            if (item.getProduct().getProductID() == product.getProductID()){
                items.remove(item);
                item.setQuantity(quantity);
                items.add(item);
                return;
            }
        }
    }
    public double getTotalPrice() {
        double total = 0;
        for (ShoppingCartItem item : this.items) {
            total += (item.getProduct().getPrice() * item.getQuantity());
        }
        return total;
    }
    public void emptyCart() {
        this.items.clear();
    }
}