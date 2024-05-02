package Practice.Ex10;


import java.util.Scanner;

    public class IncrementArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрос у пользователя на ввод числа, с которого начнется заполнение массива
            System.out.print("Введите начальное число: ");
            int startNumber = scanner.nextInt();

            // Создание двумерного массива размером 5x5
            int[][] array = new int[5][5];

            // Заполнение массива по заданному принципу
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = startNumber + 7 * (i * array[i].length + j);
                }
            }

            // Вывод массива на экран
            System.out.println("Созданный двумерный массив:");
            printArray(array);
        }

        // Метод для вывода двумерного массива на экран
        public static void printArray(int[][] array) {
            for (int[] row : array) {
                for (int num : row) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
        }
    }

