public class UserAuthentication {
    private static UserAuthentication instance;
    private boolean loggedIn;

    private UserAuthentication() {
        this.loggedIn = false; // Default is logged out
    }

    public static synchronized UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login() {
        this.loggedIn = true;
        System.out.println("User logged in.");
    }

    public void logout() {
        this.loggedIn = false;
        System.out.println("User logged out.");
    }

    public boolean isLoggedIn() {
        return this.loggedIn;
    }
}
