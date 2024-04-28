package Practice.Ex8;

import java.util.Scanner;

public class HollowRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for (int i =1; i <=rows; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Переход на новую строку после вывода верхней границы


        // Вывод боковых границ квадрата
        for (int i = 2; i < columns; i++) {
            System.out.print("* "); // Левая граница
            for (int j = 2; j < rows; j++) {
                System.out.print("  "); // Пробелы внутри квадрата
            }
            System.out.println("*"); // Правая граница
        }
        // Вывод нижней границы квадрата
        for (int i = 1; i <= rows; i++) {
            System.out.print("* ");
        }
    }
}


