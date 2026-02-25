package Assignment.Ass1.Module3;

public class BankAccount {

    // Encapsulated data (private fields)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC1001", 5000);

        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Current Balance: " + acc.getBalance());
    }
}