package Practice.Ex3.ArithmeticOperatons;

import java.util.Scanner;

public class ArOp {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double b  = scanner.nextDouble();

        double c = a+b;
        double d = a-b;
        double e = a*b;

        System.out.println("Summ:" +  c);
        System.out.println("Difference: " + d);
        System.out.println("Multiplication: " + e);

        scanner.close();
    }
}
