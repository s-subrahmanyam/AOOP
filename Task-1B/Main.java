// Main.java
public class Main {
    public static void main(String[] args) {
        UserLoginManager loginManager = UserLoginManager.getInstance();
        BankOperations bankOperations = new BankOperations();

        // Attempting operations before login
        bankOperations.viewBalance(); // Should prompt for login
        bankOperations.deposit(100);   // Should prompt for login
        bankOperations.withdraw(50);   // Should prompt for login

        // Logging in
        loginManager.login();

        // Performing operations after login
        bankOperations.viewBalance(); // Should succeed
        bankOperations.deposit(100);   // Should succeed
        bankOperations.withdraw(50);   // Should succeed

        // Logging out
        loginManager.logout();

        // Attempting operations after logout
        bankOperations.viewBalance(); // Should prompt for login
        bankOperations.deposit(100);   // Should prompt for login
        bankOperations.withdraw(50);   // Should prompt for login
    }
}
