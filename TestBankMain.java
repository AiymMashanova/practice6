public class TestBankMain{
    public static void main(String[] args){
        Bank costumer1 = new Bank("KZ0777", 100000.0);
        Bank costumer2 = new Bank("KZ011", 20000);
        System.out.println("Number: "+ costumer1.getAccountNumber()+" Balance: "+ costumer1.getBalance());
        System.out.println("Number: "+ costumer2.getAccountNumber()+" Balance: "+ costumer2.getBalance());

    }
}