

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products to the inventory
        inventory.addProduct(new Product(101, "Laptop", 850.0, 10));
        inventory.addProduct(new Product(102, "Phone", 500.0, 20));
        inventory.addProduct(new Product(103, "Monitor", 150.0, 15));

        // Iterating over the products
        System.out.println("Product List:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Sort by price
        inventory.sortByPrice();
        System.out.println("\nProducts sorted by price:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Sort by name
        inventory.sortByName();
        System.out.println("\nProducts sorted by name:");
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Clone a product
        try {
            Product clonedProduct = inventory.cloneProduct(101);
            System.out.println("\nCloned Product: " + clonedProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Remove a product
        inventory.removeProduct(102);
        System.out.println("\nAfter removing product with ID 102:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}
