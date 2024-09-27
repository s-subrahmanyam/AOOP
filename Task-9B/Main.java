public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Shared bank account with initial balance of 1000

        // Creating multiple threads simulating users
        Thread user1 = new Thread(new Transaction(account, 200, "deposit"));
        Thread user2 = new Thread(new Transaction(account, 300, "withdraw"));
        Thread user3 = new Thread(new Transaction(account, 150, "deposit"));
        Thread user4 = new Thread(new Transaction(account, 500, "withdraw"));
        
        // Start threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
