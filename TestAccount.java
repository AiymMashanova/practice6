public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account("12345", "Amina", 1000.0);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: $" + acc.getBalance());

        acc.deposit(500);
        System.out.println("\nAfter deposit: " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("After withdrawal: " + acc.getBalance());
    }
}

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber; }
    public String getAccountHolder() {
        return accountHolder; }
    public double getBalance() {
        return balance; }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}

