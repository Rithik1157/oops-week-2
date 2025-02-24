class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 999.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15 Pro", 1199.99);

        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
