public class Logger {
    // Static variable to hold the single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
    }

    // Public method to provide access to the single instance of Logger
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
