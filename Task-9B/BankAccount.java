public class BankAccount {
    private double balance;

    // Constructor to initialize account with balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized method for deposit
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    // Synchronized method for withdrawal
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
