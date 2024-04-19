package Practice.InterfaceMethods.BankOperations;

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void welcomeCustomer(Customer customer) {
        System.out.println("Welcome to " + name + ", " + customer.getClass().getSimpleName() + "!");
        customer.openAccount();
    }
}