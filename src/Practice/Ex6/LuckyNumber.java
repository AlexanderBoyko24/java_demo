package Practice.Ex6;

import java.util.Scanner;

public class LuckyNumber {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 6-значное число");
        int number = scanner.nextInt();

        if (isSixDigit(number)) {
            if (isHappyNumber(number)) {
                System.out.println("Введенное число является счастливым!");
            } else {
                System.out.println("Введенное число не является счастливым.");
            }
        } else {
            System.out.println("Ошибка: Введено не шестизначное число.");
        }
    }

    // Проверка на шестизначность числа
    public static boolean isSixDigit(int num) {
        return num >= 100000 && num <= 999999;
    }

    // Проверка на счастливое число
    public static boolean isHappyNumber(int num) {
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        // Разделение числа на две половины и подсчет суммы цифр
        for (int i = 0; i < 3; i++) {
            sumFirstHalf += num % 10;
            num /= 10;
        }
        for (int i = 0; i < 3; i++) {
            sumSecondHalf += num % 10;
            num /= 10;
        }

        return sumFirstHalf == sumSecondHalf;
    }
}
