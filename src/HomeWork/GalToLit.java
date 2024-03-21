package HomeWork;

import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Ведите число:");
        while (true) {
            double gallons;
            gallons = input.nextDouble();
            double liters;
            liters = gallons * 3.7854;

            if (gallons <=0) break;

            System.out.println(gallons + " галлонам соответсвует " + liters + " литров");
            System.out.println();
          System.out.println("Введите другое число, чтобы продолжить работу.");
          System.out.println("Введите 0, чтобы завершить работу.");

        }
    }
}