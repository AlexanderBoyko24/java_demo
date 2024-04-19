package Practice.InterfaceMethods.BankStatic;

public interface Bank {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);

    // Static method to create a bank account
    static Bank createAccount(double initialBalance) {
        return new SavingsAccount(initialBalance);
    }
}
