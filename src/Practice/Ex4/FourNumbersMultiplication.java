package Practice.Ex4;

import java.util.Scanner;

public class FourNumbersMultiplication {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запросить у пользователя четырехзначное число
            System.out.print("Введите четырехзначное число: ");
            String input = scanner.nextLine();

            // Проверить, что введенная строка состоит из четырех символов (цифр)
            if (input.length() != 4) {
                System.out.println("Ошибка: Введите четырехзначное число.");
                return; // Завершить программу, если введено не четырехзначное число
            }

            // Инициализация переменной для хранения произведения цифр
            int product = 1;

            // Итерация по каждой цифре в строке input
            for (int i = 0; i < 4; i++) {
                // Получить текущий символ (цифру) из строки и преобразовать в целое число
                char digitChar = input.charAt(i);
                int digit = Character.getNumericValue(digitChar);

                // Умножить текущую цифру на текущее значение произведения
                product *= digit;
            }

            // Вывести результат произведения цифр
            System.out.println("Произведение цифр: " + product);

            scanner.close(); // Закрыть Scanner
        }
    }
