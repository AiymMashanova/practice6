public class morfTask9 {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount(1000);
        BankAccount b2 = new CheckingAccount(1000);

        b1.withdraw(200);
        b2.withdraw(200);
    }
}

class BankAccount {
    double balance;
    BankAccount(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    public void withdraw(double amount) {
        if (amount > balance * 0.5)
            System.out.println("Cannot withdraw more than 50% in savings account.");
        else {
            balance -= amount;
            System.out.println("Savings withdraw: " + balance);
        }
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(double balance) {
        super(balance);
    }
    public void withdraw(double amount) {
        balance -= (amount + 10);
        System.out.println("Checking withdraw (with $10 fee): " + balance);
    }
}

