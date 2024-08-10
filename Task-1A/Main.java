public class Main {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("Application started");
        logger.log("Processing data");
        logger.log("Application finished");
    }
}
