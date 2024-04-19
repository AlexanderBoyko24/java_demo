package Practice.InterfaceMethods.BankDefault;

public class BankExample {
    public static void main(String[] args) {
        // Create a savings account using the static method
        Bank account = new SavingAccount(1000);

        // Access and display the account type
        account.displayAccountType();

        // Deposit and withdraw funds
        account.deposit(500);
        account.withdraw(200);

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
