package Practice.InterfaceMethods.BankStatic;

public class BankStaticMethodExample {
    public static void main(String[] args) {
        // Create a savings account using the static method
        Bank account = Bank.createAccount(1000);

        // Deposit and withdraw funds
        account.deposit(500);
        account.withdraw(200);

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
