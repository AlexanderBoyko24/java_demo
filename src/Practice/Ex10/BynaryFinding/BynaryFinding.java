package Practice.Ex10.BynaryFinding;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class BynaryFinding {
          public static void main(String[] args) {
            // Создаем массив случайных чисел и сортируем его
            int[] array = generateRandomArray(10);
            Arrays.sort(array);

            // Выводим массив на экран
            System.out.println("Отсортированный массив:");
            System.out.println(Arrays.toString(array));

            // Запрашиваем у пользователя число для поиска
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число для поиска: ");
            int target = scanner.nextInt();

            // Выполняем бинарный поиск
            int index = binarySearch(array, target);

            // Выводим результат на экран
            if (index != -1) {
                System.out.println("Число " + target + " найдено в массиве на позиции " + index);
            } else {
                System.out.println("Число " + target + " не найдено в массиве");
            }
        }

        // Метод для генерации массива случайных чисел
        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100); // генерируем числа от 0 до 99
            }
            return array;
        }

        // Метод для выполнения бинарного поиска
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid; // число найдено, возвращаем индекс
                } else if (array[mid] < target) {
                    left = mid + 1; // если искомое число больше значения в середине, ищем справа
                } else {
                    right = mid - 1; // если искомое число меньше значения в середине, ищем слева
                }
            }

            return -1; // если число не найдено
        }
    }


