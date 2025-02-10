abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}

public class BankingSystem {
    public static void processAccount(BankAccount account) {
        System.out.println(account.getHolderName() + " | Interest: " + account.calculateInterest());
        if (account instanceof Loanable) {
            ((Loanable) account).applyForLoan(20000);
            System.out.println("Loan Eligible: " + ((Loanable) account).calculateLoanEligibility());
        }
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S123", "Alice", 10000);
        CurrentAccount current = new CurrentAccount("C456", "Bob", 15000);

        processAccount(savings);
        processAccount(current);
    }
}
