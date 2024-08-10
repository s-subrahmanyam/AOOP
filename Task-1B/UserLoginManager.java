// UserLoginManager.java (Singleton)
public class UserLoginManager {
    private static UserLoginManager instance;
    private boolean loggedIn;

    // Private constructor to prevent instantiation
    private UserLoginManager() {
        this.loggedIn = false; // Default state is logged out
    }

    // Synchronized method to control simultaneous access
    public static synchronized UserLoginManager getInstance() {
        if (instance == null) {
            instance = new UserLoginManager();
        }
        return instance;
    }

    // Login method
    public void login() {
        this.loggedIn = true;
        System.out.println("User logged in.");
    }

    // Logout method
    public void logout() {
        this.loggedIn = false;
        System.out.println("User logged out.");
    }

    // Check login status
    public boolean isLoggedIn() {
        return this.loggedIn;
    }
}
