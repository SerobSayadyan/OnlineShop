package onlineShop;

/**
 * The Buyer class specifies information about buyer/client of a shop<pre>
 *          - get <i><b>buyer ID</i></b>
 *          - get/set <i><b>first name</i></b>
 *          - get/set <i><b>last name</i></b>
 *          - add product to cart
 *          - get shopping cart</pre>
 */

public class Buyer {
    private static int buyerStaticID = 0;
    private int buyerID = 0;
    private String firstName;
    private String lastName;
    private ShoppingCart shoppingCart;

    public Buyer(String firstName, String lastName) {
        this.buyerID = ++Buyer.buyerStaticID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shoppingCart = new ShoppingCart();
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addProductToCart(Product product, int quantity){
        shoppingCart.addItem(product, quantity);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
