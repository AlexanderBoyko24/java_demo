package Practice.Ex10.TwoDArray;

import java.util.Arrays;
import java.util.Random;
public class TwoDArrayMaxMinRows {
    public static void main(String[] args) {
        // Создаем двумерный массив размером 3x3 и заполняем случайными числами
        int[][] array = generateRandomArray(3, 3);

        // Выводим массив на экран
        System.out.println("Двумерный массив:");
        printArray(array);

        // Находим минимальный и максимальный элементы для каждой строки
        findMinMaxForEachRow(array);
    }

    // Метод для генерации двумерного массива случайных чисел
    public static int[][] generateRandomArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100); // генерируем случайные числа от 0 до 99
            }
        }
        return array;
    }

    // Метод для вывода двумерного массива на экран
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Метод для нахождения минимального и максимального элементов для каждой строки
    public static void findMinMaxForEachRow(int[][] array) {
        System.out.println("Минимальные и максимальные элементы для каждой строки:");

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0]; // предполагаем, что первый элемент в строке - минимальный
            int max = array[i][0]; // предполагаем, что первый элемент в строке - максимальный

            // Находим минимальный и максимальный элементы в текущей строке
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            // Выводим минимальный и максимальный элементы для текущей строки
            System.out.println("Строка " + (i + 1) + ": Минимальный элемент: " + min + ", Максимальный элемент: " + max);
        }
    }
}
