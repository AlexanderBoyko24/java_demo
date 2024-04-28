package Practice.Ex4;

import java.util.Scanner;

public class Turnover {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырёхзначное число:");
        String input = scanner.nextLine();

        // Проверяем, что введено четырёхзначное число
        if (input.length() != 4) {
            System.out.println("Ошибка: Введите четырёхзначное число.");
        } else {
            // Переворачиваем строку с цифрами
            String reversed = new StringBuilder(input).reverse().toString();

            // Выводим результат
            System.out.println("Перевёрнутое число: " + reversed);
        }

        scanner.close();
    }
}
