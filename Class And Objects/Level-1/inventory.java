import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    
    public static void main(String[] args) {
        Item item1 = new Item(101, "Wireless Mouse", 25.50);
        
        item1.displayDetails();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();
        
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
        
        scanner.close();
    }
}
