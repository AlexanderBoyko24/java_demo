package Practice.Percentage;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение");
        double a = scanner.nextDouble();

        System.out.println("Введите процент");
        double b = scanner.nextDouble();

        double c = b/100*a;

        System.out.println("Процент: " + c);

        scanner.close();
    }
}
