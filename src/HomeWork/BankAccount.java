package HomeWork;

//Напишите класс "BankAccount", который имеет следующие характеристики:
//        •	Номер счета.
//        •	Баланс счета.
//        •	Методы для пополнения и снятия денег со счета.
//Создайте несколько объектов класса "БанковскийСчет" и проведите несколько операций по пополнению и снятию денег.

public class BankAccount {
    int accNumber;
    double accBalance;


    public BankAccount(int num, int bal) {
        accNumber = num;
        accBalance = bal;
    }

    public void addmoney(double sum) {
        accBalance += sum;
        System.out.println("You added"  + sum + " . New balance: " + accBalance);
    }

    // Метод для снятия средств со счета
    public void takeoffmoney(double sum) {
        if (sum <= accBalance) {
            accBalance -= sum;
            System.out.println("You took off "  + sum + " . New balance: " + accBalance);
        } else {
            System.out.println("Not enough money " + accNumber);
        }
    }
}


