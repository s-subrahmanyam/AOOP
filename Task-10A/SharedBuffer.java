import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<String> buffer;
    private int capacity;

    // Constructor to initialize the shared buffer
    public SharedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    // Synchronized method to add a message to the buffer
    public synchronized void put(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait until space is available
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notify(); // Notify a waiting consumer
    }

    // Synchronized method to retrieve a message from the buffer
    public synchronized String get() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until a message is available
        }
        String message = buffer.poll();
        notify(); // Notify a waiting producer
        return message;
    }
}
