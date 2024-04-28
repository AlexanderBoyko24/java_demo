package Practice.Ex8;

import java.util.Scanner;

public class TableOfMuptiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона:");
        int start = scanner.nextInt();

        System.out.println("Введите конец диапазона:");
        int end = scanner.nextInt();

        System.out.println("Таблица умножения в диапазоне от " + start + " до " + end + ":");

        for (int i = 1; i <= 10; i++) { // 10 значений в таблице умножения
            for (int j = start; j <= end; j++) {
                System.out.printf("%2d * %2d = %2d   ", j, i, j * i);
            }
            System.out.println(); // Переход на новую строку после каждой строки таблицы
        }

        scanner.close();
    }
}
