import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 1, 70000),
            new Employee("Bob", 2, 80000),
            new Employee("Charlie", 3, 75000),
            new Employee("David", 4, 65000),
            new Employee("Eve", 5, 72000),
            new Employee("Frank", 6, 68000),
            new Employee("Grace", 7, 77000),
            new Employee("Hannah", 8, 69000),
            new Employee("Ivy", 9, 74000),
            new Employee("Jack", 10, 80000)
        );

        // Filtering: Employees with salary greater than 70000
        System.out.println("Employees with salary greater than 70000:");
        employees.stream()
                 .filter(e -> e.getSalary() > 70000)
                 .forEach(System.out::println);

        // Sorting: Employees by salary in descending order
        System.out.println("\nEmployees sorted by salary (descending):");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                 .forEach(System.out::println);

        // Finding the highest salary
        Optional<Employee> highestSalaryEmployee = employees.stream()
                                                            .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nEmployee with highest salary:");
        highestSalaryEmployee.ifPresent(System.out::println);

        // Calculating the average salary
        OptionalDouble averageSalary = employees.stream()
                                                .mapToDouble(Employee::getSalary)
                                                .average();
        System.out.println("\nAverage salary:");
        System.out.println(averageSalary.isPresent() ? averageSalary.getAsDouble() : "No data available");
    }
}
