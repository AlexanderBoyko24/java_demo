package HomeWork;

import java.util.Scanner;

public class GalToLit{
    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        double gallons;

        do   {
            gallons = input.nextDouble();
            double liters;

            liters = gallons * 3.7854;

            System.out.println(gallons + " галлонам соответсвует " + liters + " литров");
            // System.out.println("Enter another number"); - как зациклить эту программу, чтобы я мог вводить другие числа?
        } while (gallons > 0);

    }
}