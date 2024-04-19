package Practice.InterfaceMethods.BankDefault;

public class SavingAccount implements Bank{
    private double balance;

    public SavingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Overriding the default method to display a specific account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
