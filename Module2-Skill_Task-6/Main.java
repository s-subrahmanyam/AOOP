import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 3, 70000));
        employees.add(new Employee("Bob", 1, 60000));
        employees.add(new Employee("Charlie", 2, 80000));

        // Sort employees by ID (default Comparable sorting)
        Collections.sort(employees);
        System.out.println("Employees sorted by ID:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort employees by name using EmployeeNameComparator
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("\nEmployees sorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort employees by salary using EmployeeSalaryComparator
        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
