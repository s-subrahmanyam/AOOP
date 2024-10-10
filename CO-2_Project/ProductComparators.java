import java.util.Comparator;

public class ProductComparators {
    // Comparator for sorting by price
    public static Comparator<Product> compareByPrice = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    };

    // Comparator for sorting by name
    public static Comparator<Product> compareByName = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };
}
