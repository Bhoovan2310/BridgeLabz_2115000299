class BankAccount {
    static String bankName = "XYZ Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println(accountHolderName + " - " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001);
        acc1.display();
        getTotalAccounts();
    }
}
