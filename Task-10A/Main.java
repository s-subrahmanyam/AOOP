public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5); // Shared buffer with a capacity of 5
        
        // Creating producer and consumer threads
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        
        // Start threads
        producerThread.start();
        consumerThread.start();
    }
}
