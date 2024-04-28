package Practice.Ex4;

import java.util.Scanner;

public class MetersTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите количество метров (для выхода введите 'exit'):");

            // Чтение ввода пользователя
            String input = scanner.nextLine();

            // Проверка на выход из программы
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break; // Выход из цикла
            }

            double meters;

            try {
                meters = Double.parseDouble(input); // Преобразование строки в число
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число или 'exit' для завершения.");
                continue; // Переход к следующей итерации цикла
            }

            // Вычисление других единиц измерения
            double centimeters = meters * 100;
            double decimeters = meters * 10;
            double millimeters = meters * 1000;
            double miles = meters / 1609.34; // 1 миля ≈ 1609.34 метра

            // Вывод результатов с объяснением единиц измерения
            System.out.println("Результаты перевода для " + meters + " метров:");
            System.out.println("Сантиметры: " + centimeters + " см");
            System.out.println("Дециметры: " + decimeters + " дм");
            System.out.println("Миллиметры: " + millimeters + " мм");
            System.out.println("Мили: " + miles + " миль");
        }

        scanner.close(); // Закрыть Scanner
    }
}
