public class Main {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10); // Bounded buffer with a capacity of 10

        // Creating producer and consumer threads
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        // Starting producer and consumer threads
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
