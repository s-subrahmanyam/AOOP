public class Consumer implements Runnable {
    private SharedBuffer buffer;

    // Constructor to initialize consumer with the shared buffer
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to consume messages
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) { // Consuming 10 messages
            try {
                String message = buffer.get();
                System.out.println("Consumed: " + message);
                Thread.sleep(1000); // Simulate time taken to consume a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
