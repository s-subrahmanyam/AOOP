public class Producer implements Runnable {
    private SharedBuffer buffer;
    
    // Constructor to initialize producer with the shared buffer
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to generate messages
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) { // Producing 10 messages
            try {
                String message = "Message " + i;
                buffer.put(message);
                Thread.sleep(500); // Simulate time taken to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
