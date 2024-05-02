package Practice.Ex10.TwoDArray;
import java.util.Arrays;
import java.util.Scanner;
public class OtherEx {



        public static void main(String[] args) {
            int[][] array = new int[3][4];

            System.out.println("Заполните массив:");
            Scanner scanner = new Scanner(System.in);

            // Заполнение массива значениями, введенными пользователем
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            // Вывод массива на экран
            System.out.println("Элементы массива:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            // Вычисление суммы элементов массива
            int sum = 0;
            for (int[] row : array) {
                for (int element : row) {
                    sum += element;
                }
            }
            System.out.println("Сумма элементов массива: " + sum);

            // Вычисление среднего арифметического
            double avg = (double) sum / (array.length * array[0].length);
            System.out.println("Среднее арифметическое: " + avg);
        }
    }


