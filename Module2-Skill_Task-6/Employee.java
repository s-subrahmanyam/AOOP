public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}
