package Practice.BankOperations;

public class Operations {
    public static void main(String[] args) {
        Bank myBank = new Bank("MyBank");

        SavingsAccountCustomer customer1 = new SavingsAccountCustomer();
        myBank.welcomeCustomer(customer1);

        customer1.deposit(1000);
        customer1.withdraw(200);
        customer1.closeAccount();
    }
}


