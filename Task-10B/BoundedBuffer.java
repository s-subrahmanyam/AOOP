import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private Queue<String> buffer;
    private int capacity;

    // Constructor to initialize the bounded buffer
    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    // Synchronized method to add an item to the buffer
    public synchronized void put(String item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait until space is available
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify(); // Notify a waiting consumer
    }

    // Synchronized method to retrieve an item from the buffer
    public synchronized String get() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until an item is available
        }
        String item = buffer.poll();
        notify(); // Notify a waiting producer
        return item;
    }
}
