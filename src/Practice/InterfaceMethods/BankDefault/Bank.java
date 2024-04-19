package Practice.BankDefault;

public interface Bank {
    // Abstract methods
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);

    // Default method to display account type
    default void displayAccountType() {
        System.out.println("Account Type: Generic");
    }

}

