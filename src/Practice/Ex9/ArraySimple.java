package Practice.Ex9;
import java.util.Scanner;
public class ArraySimple {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод массива
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Ввод числа для поиска
            System.out.print("Введите число для поиска: ");
            int searchNumber = scanner.nextInt();

            // Подсчет количества вхождений
            int count = countOccurrences(array, searchNumber);

            System.out.println("Число " + searchNumber + " встречается в массиве " + count + " раз.");

            scanner.close();
        }

        // Метод для подсчета количества вхождений числа в массиве
        public static int countOccurrences(int[] array, int searchNumber) {
            int count = 0;
            for (int num : array) {
                if (num == searchNumber) {
                    count++;
                }
            }
            return count;
        }
    }


