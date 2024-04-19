package Practice.InterfaceMethods.BankPrivate;

    public class BankPrivateMethodExample {
        public static void main(String[] args) {
            Bank account = new SavingsAccount(1000);

            // Execute transactions
            account.executeTransaction("DEPOSIT", 500);
            account.executeTransaction("WITHDRAW", 200);
            account.executeTransaction("WITHDRAW", 2000); // Should fail due to insufficient funds

            System.out.println("Final Balance: $" + account.getBalance());
        }
}
