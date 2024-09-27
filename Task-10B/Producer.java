public class Producer implements Runnable {
    private BoundedBuffer buffer;

    // Constructor to initialize producer with the bounded buffer
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to generate items
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) { // Producing 20 items
            try {
                String item = "Item " + i;
                buffer.put(item);
                Thread.sleep(500); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
