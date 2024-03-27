package HomeWork;

import java.util.Scanner;

public class AccBankOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount bankAccount1 = new BankAccount(123, 200);

        System.out.println("Enter any operation");
        System.out.println("Add\nTake off");
        String operation = input.nextLine();

        switch (operation) {
            case "Add":
                System.out.println("Enter sum you want to add");
                double sumadded = input.nextDouble();
                bankAccount1.addmoney(sumadded);
                break;


            case "Take off":
                System.out.println("Enter sum you want to take off");
                double sumtakenoff = input.nextDouble();
                bankAccount1.takeoffmoney(sumtakenoff);
               break;
        }
    }
}
