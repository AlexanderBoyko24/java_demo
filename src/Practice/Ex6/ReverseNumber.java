package Practice.Ex6;


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int number = scanner.nextInt();

        if (isSixDigit(number)) {
            int swappedNumber = swapDigits(number);
            System.out.println("Число после перестановки: " + swappedNumber);
        } else {
            System.out.println("Ошибка: Введено не шестизначное число.");
        }
    }

    // Проверка на шестизначность числа
    public static boolean isSixDigit(int num) {
        return num >= 100000 && num <= 999999;
    }

    // Перестановка цифр в числе
    public static int swapDigits(int num) {
        // Получаем каждую цифру числа
        int digit1 = (num / 100000) % 10;
        int digit2 = (num / 10000) % 10;
        int digit3 = (num / 1000) % 10;
        int digit4 = (num / 100) % 10;
        int digit5 = (num / 10) % 10;
        int digit6 = num % 10;

        // Формируем число с переставленными цифрами
        int swappedNumber = digit6 * 100000 + digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;

        return swappedNumber;
    }
}
