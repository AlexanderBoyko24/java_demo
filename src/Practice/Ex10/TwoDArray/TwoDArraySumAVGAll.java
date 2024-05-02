package Practice.Ex10.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraySumAVGAll {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        System.out.println("Заполните массив");
        Scanner scanner = new Scanner(System.in);
        //заполнение массива 1 способ
//        array[0][0] = scanner.nextInt();
//        array[0][1] = scanner.nextInt();
//        array[0][2] = scanner.nextInt();
//        array[0][3] = scanner.nextInt();
//        array[1][0] = scanner.nextInt();
//        array[1][1] = scanner.nextInt();
//        array[1][2] = scanner.nextInt();
//        array[1][3] = scanner.nextInt();
//        array[2][0] = scanner.nextInt();
//        array[2][1] = scanner.nextInt();
//        array[2][2] = scanner.nextInt();
//        array[2][3] = scanner.nextInt();

        //2 способ
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        int avg =  sum / (array.length * array[0].length);
        System.out.println("Среднее арифметическое: " + avg);

        System.out.println(Arrays.deepToString(array));
        }
    }

