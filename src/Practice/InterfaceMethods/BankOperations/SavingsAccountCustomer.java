package Practice.BankOperations;
// Create a class for a SavingsAccount customer

 class SavingsAccountCustomer implements Customer{
     private double balance;

    public SavingsAccountCustomer() {
        balance = 0;
    }

    @Override
    public void openAccount() {
        System.out.println("Savings Account opened.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Savings Account closed.");
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

