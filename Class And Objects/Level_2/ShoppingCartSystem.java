package Level_2;

class ShoppingCart {
    String itemName; 
    double price; 
    int quantity; 

    ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void removeItem() {
        this.itemName = null; 
        this.price = 0; 
        this.quantity = 0;
    }

    public void display() {
        if (itemName == null) {
            System.out.println("No items in the cart.");
        } else {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + (price * quantity));
        }
        System.out.println("---------------------------");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart("Laptop", 50000, 2);
        ShoppingCart cart2 = new ShoppingCart("Mobile", 20000, 3);

        cart1.display();

        cart1.addItem("Mobile", 20000, 3);
        cart1.display();

        cart1.removeItem();
        cart1.display();

        cart2.display();

        cart2.addItem("Laptop", 50000, 2);
        cart2.display();
    }
}