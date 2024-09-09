// PriorityQueue.java
import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueue<T extends Comparable<T>> {
    private ArrayList<T> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    // Method to insert an element in the queue
    public void enqueue(T item) {
        queue.add(item);
        Collections.sort(queue);  // Sort the queue to maintain priority
    }

    // Method to remove the highest priority element
    public T dequeue() {
        if (!isEmpty()) {
            return queue.remove(0);  // Remove the element with the highest priority (smallest)
        }
        return null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to peek at the highest priority element without removing it
    public T peek() {
        if (!isEmpty()) {
            return queue.get(0);
        }
        return null;
    }
}
