import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(customer, this, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " at " + name + " with initial deposit: $" + initialDeposit);
    }
    
    public void displayCustomers() {
        System.out.println("\nBank: " + name);
        if (customers.isEmpty()) {
            System.out.println("No customers yet.");
        } else {
            for (Customer customer : customers) {
                customer.displayAccounts();
            }
        }
    }
}


class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\n" + name + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void displayAccounts() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("  " + account);
        }
    }
}

class Account {
    private Customer customer;
    private Bank bank;
    private double balance;
    private static int accountCounter = 1000;
    private int accountNumber;

    public Account(Customer customer, Bank bank, double initialDeposit) {
        this.customer = customer;
        this.bank = bank;
        this.balance = initialDeposit;
        this.accountNumber = accountCounter++;
    }

    public String getBankName() {
        return bank.getName();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " | Bank: " + getBankName() + " | Balance: $" + balance;
    }
}

public class BankAndAccountHolder {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank1.openAccount(customer1, 5000);
        bank1.openAccount(customer1, 3000);
        bank1.openAccount(customer2, 7000);

        System.out.println();
        customer1.viewBalance();
        customer2.viewBalance();

        System.out.println();
        bank1.displayCustomers();

        System.out.println();
        customer1.viewBalance();
    }
}
