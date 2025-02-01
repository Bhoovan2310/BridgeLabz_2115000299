public class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 12345;
        account.accountHolder = "John Doe";
        account.setBalance(1000.50);
        System.out.println(account.accountHolder);
        System.out.println(account.getBalance());
    }
}
