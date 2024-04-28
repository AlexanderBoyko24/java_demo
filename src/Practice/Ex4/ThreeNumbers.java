package Practice.Ex4;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();

        int threenumbers = a*100 + b*10 + c;

        System.out.println("решение " + threenumbers);
    }
}
