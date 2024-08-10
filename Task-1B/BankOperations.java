// BankOperations.java
public class BankOperations {
    public void viewBalance() {
        UserLoginManager loginManager = UserLoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Viewing balance...");
            // Logic to view balance
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        UserLoginManager loginManager = UserLoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Depositing " + amount + "...");
            // Logic to deposit amount
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        UserLoginManager loginManager = UserLoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Withdrawing " + amount + "...");
            // Logic to withdraw amount
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
