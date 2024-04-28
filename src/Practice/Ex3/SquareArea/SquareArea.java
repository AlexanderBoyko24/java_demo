package Practice.SquareArea;

import java.util.Scanner;


public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросить пользователя ввести размер стороны квадрата
        System.out.println("Введите размер стороны квадрата:");

        // Считать введенное значение как длину стороны квадрата
        double sideLength = scanner.nextDouble();

        // Проверить, что введенное значение положительное
        if (sideLength <= 0) {
            System.out.println("Ошибка: сторона квадрата должна быть положительным числом.");
        } else {
            // Вычислить площадь квадрата
            double area = sideLength * sideLength;

            // Вывести результат на экран
            System.out.println("Площадь квадрата с стороной " + sideLength + " равна " + area);
        }

        // Закрыть сканнер
        scanner.close();
    }
}
