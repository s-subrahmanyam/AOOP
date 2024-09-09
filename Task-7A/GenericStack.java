// GenericStack.java
public interface GenericStack<T> {
    void push(T item);       // Add an element to the stack
    T pop();                 // Remove an element from the stack
    T peek();                // Peek at the top element without removing
    boolean isEmpty();       // Check if the stack is empty
}
