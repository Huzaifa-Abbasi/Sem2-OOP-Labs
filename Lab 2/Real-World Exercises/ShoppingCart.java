/*Create a class named Item with member variables for product name, price, and quantity 
(desired by the customer).
 Create a class named ShoppingCart that has an array of Item objects representing the 
customer's cart.
 Implement methods in ShoppingCart to: 
o Add an item to the cart (check if the product exists before adding).
o Update the quantity of an existing item in the cart.
o Remove an item from the cart.
o Calculate the total bill amount considering item prices and quantities.
o Print the cart contents with item names, quantities, and individual prices */

import java.util.ArrayList;
import java.util.List;

class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {

    private List<Item> cart = new ArrayList<>();

    public String addItemToCart(Item item) {
        if (cart.contains(item)) {
            return "Product is already in the cart.";
        } else {
            cart.add(item);
            return "Product added to the cart.";
        }
    }

    public String updateQuantity(String itemName, int newQuantity) {
        for (Item item : cart) {
            if (item.name.equals(itemName)) {
                item.quantity = newQuantity;
                return "Quantity updated for " + itemName;
            }
        }
        return "Item not found in cart.";
    }

    public void printCartContents() {
        for (Item item : cart) {
            System.out.println(item); // Utilize overridden toString() method
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : cart) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("Apple", 1.00, 3);
        shoppingCart.addItemToCart(item1);

        Item item2 = new Item("Mango", 2.0, 3);
        shoppingCart.addItemToCart(item2);

        // Print initial cart contents
        System.out.println("Initial Cart Contents:");
        shoppingCart.printCartContents();

        // Update quantity of an existing item
        shoppingCart.updateQuantity("Mango", 5); // Update Mango to quantity 5

        // Print updated cart contents
        System.out.println("\nUpdated Cart Contents:");
        shoppingCart.printCartContents();

        double totalPrice = shoppingCart.calculateTotalPrice();
        System.out.println("\nUpdated Total Price: $" + totalPrice);
    }
    
}
