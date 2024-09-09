import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println(strings);
    }
}
