package Practice.Ex8;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона:");
        int number1 = scanner.nextInt();

        System.out.println("Введите конец диапазона:");
        int number2 = scanner.nextInt();

        System.out.println("Простые числа в диапазоне от " + number1 + " до " + number2 + ":");

        for (int i = number1; i <= number2; i++) {
            boolean isSimpleNumber = true;
            if (i <= 1) {
                isSimpleNumber = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isSimpleNumber = false;
                        break;
                    }
                }
            }
            if (isSimpleNumber) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
