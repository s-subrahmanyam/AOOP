public class Transaction implements Runnable {
    private BankAccount account;
    private double amount;
    private String operation;

    // Constructor to initialize transaction
    public Transaction(BankAccount account, double amount, String operation) {
        this.account = account;
        this.amount = amount;
        this.operation = operation;
    }

    // Run method to perform deposit or withdrawal
    @Override
    public void run() {
        if (operation.equals("deposit")) {
            account.deposit(amount);
        } else if (operation.equals("withdraw")) {
            account.withdraw(amount);
        }
    }
}
