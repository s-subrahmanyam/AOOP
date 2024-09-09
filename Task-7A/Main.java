// Main.java
public class Main {
    public static void main(String[] args) {
        // Integer Stack
        GenericStack<Integer> intStack = new StackImpl<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Integer Stack Top Element (Peek): " + intStack.peek());
        System.out.println("Is Integer Stack Empty: " + intStack.isEmpty());
        System.out.println("Integer Stack Popped Element: " + intStack.pop());
        System.out.println("Integer Stack Popped Element: " + intStack.pop());

        // String Stack
        GenericStack<String> stringStack = new StackImpl<>();
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Orange");

        System.out.println("String Stack Top Element (Peek): " + stringStack.peek());
        System.out.println("Is String Stack Empty: " + stringStack.isEmpty());
        System.out.println("String Stack Popped Element: " + stringStack.pop());
        System.out.println("String Stack Popped Element: " + stringStack.pop());
    }
}
