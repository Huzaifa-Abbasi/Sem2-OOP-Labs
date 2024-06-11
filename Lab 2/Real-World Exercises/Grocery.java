/*Create a class named Product with member variables for name, price, and quantity (in 
stock).
 Create a class named GroceryStore that has an array of Product objects representing its 
inventory.
 Implement methods in GroceryStore to: 
o Add a new product to the inventory.
o Sell a product (reduce quantity by 1, assuming sufficient stock).
o Search for a product by name and display its details (if found).
o Print a report showing all products and their current stock levels */

class Product{
    String name;
    int quantity;
    double price;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class GroceryStore {
    Product[] invenory = new Product[10];
 
    GroceryStore() {
    }
 
    public void addProduct(String var1, double var2, int var4, int var5) {
       Product var6 = new Product(var1, var2, var4);
       this.invenory[var5] = var6;
    }
 
    public void showProduct() {
       for(int var1 = 0; var1 < this.invenory.length; ++var1) {
          System.out.println(this.invenory[var1].name);
          System.out.println(this.invenory[var1].price);
          System.out.println(this.invenory[var1].quantity);
       }
 
    }
 }
 
 public class Grocery {
    public Grocery() {
    }
 
    public static void main(String[] var0) {
       GroceryStore var1 = new GroceryStore();
       var1.addProduct("Laptop DELL E25", 50000.0, 100, 0);
       var1.addProduct("Laptop HP H25", 60000.0, 80, 1);
       var1.showProduct();
    }
 }
