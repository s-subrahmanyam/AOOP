// Main.java
public class Main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {10, 20, 30, 40, 50};
        ArrayOperations<Integer> intOps = new ArrayOperations<>(intArray);
        System.out.println("Integer Array - Min: " + intOps.min() + ", Max: " + intOps.max());

        // String array
        String[] strArray = {"Apple", "Mango", "Banana", "Orange"};
        ArrayOperations<String> strOps = new ArrayOperations<>(strArray);
        System.out.println("String Array - Min: " + strOps.min() + ", Max: " + strOps.max());

        // Character array
        Character[] charArray = {'a', 'z', 'e', 'k'};
        ArrayOperations<Character> charOps = new ArrayOperations<>(charArray);
        System.out.println("Character Array - Min: " + charOps.min() + ", Max: " + charOps.max());

        // Float array
        Float[] floatArray = {1.2f, 5.6f, 3.8f, 0.9f};
        ArrayOperations<Float> floatOps = new ArrayOperations<>(floatArray);
        System.out.println("Float Array - Min: " + floatOps.min() + ", Max: " + floatOps.max());
    }
}
