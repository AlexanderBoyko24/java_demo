package Practice.Ex7;

import java.util.Scanner;

public class RangeOfNumbers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        // Проверка порядка чисел и, если нужно, их обмен
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Вывод чисел в диапазоне
        for (int i = num1; i <= num2; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
