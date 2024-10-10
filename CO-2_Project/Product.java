public class Product implements Comparable<Product>, Cloneable {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Comparable: Compare by id (default sorting)
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.id, other.id);
    }

    // Cloneable: To clone a product
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Product(this.id, this.name, this.price, this.quantity);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
