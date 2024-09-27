public class Consumer implements Runnable {
    private BoundedBuffer buffer;

    // Constructor to initialize consumer with the bounded buffer
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to consume items
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) { // Consuming 20 items
            try {
                String item = buffer.get();
                System.out.println("Consumed: " + item);
                Thread.sleep(1000); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
