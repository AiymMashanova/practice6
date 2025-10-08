public class Bank {
    private String accountNumber;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public Bank(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}


