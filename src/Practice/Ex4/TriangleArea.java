package Practice.Ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите длину основания треугольника (в сантиметрах):");
            double base = Double.parseDouble(scanner.next());

            System.out.println("Введите длину высоты треугольника (в сантиметрах):");
            double height = Double.parseDouble(scanner.next());

            // Проверка на отрицательные значения
            if (base <= 0 || height <= 0) {
                System.out.println("Ошибка: Основание и высота должны быть положительными числами.");
            } else {
                // Вычисление площади треугольника
                double triangleArea = 0.5 * base * height;

                // Вывод результата
                System.out.println("Площадь треугольника: " + triangleArea + " квадратных сантиметров.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите корректное числовое значение.");
        } finally {
            scanner.nextLine(); // Очистка буфера Scanner после возможной ошибки ввода
            scanner.close();
        }
    }
}
