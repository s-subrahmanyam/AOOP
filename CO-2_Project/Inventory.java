import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Inventory implements Iterable<Product> {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from the inventory
    public void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Get product by ID
    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Sort products by default (ID)
    public void sortById() {
        Collections.sort(products);
    }

    // Sort products using custom Comparator (by price)
    public void sortByPrice() {
        Collections.sort(products, ProductComparators.compareByPrice);
    }

    // Sort products using custom Comparator (by name)
    public void sortByName() {
        Collections.sort(products, ProductComparators.compareByName);
    }

    // Clone product by ID
    public Product cloneProduct(int id) throws CloneNotSupportedException {
        Product product = getProduct(id);
        if (product != null) {
            return (Product) product.clone();
        }
        return null;
    }

    // Implement the iterator for Inventory
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
