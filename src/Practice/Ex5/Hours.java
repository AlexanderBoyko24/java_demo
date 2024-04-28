package Practice.Ex5;

import java.util.Scanner;
import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество часов:");
        int hour = scanner.nextInt();

        // Проверяем корректность введенного часа
        if (hour < 0 || hour > 23) {
            System.out.println("Ошибка: введите час от 0 до 23.");
        } else {
            // Определяем время суток и выводим соответствующее приветствие
            if (hour >= 0 && hour < 6) {
                System.out.println("Good Night");
            } else if (hour >= 6 && hour < 13) {
                System.out.println("Good Morning");
            } else if (hour >= 13 && hour < 17) {
                System.out.println("Good Day");
            } else { // hour >= 17 && hour <= 23 || hour == 0
                System.out.println("Good Evening");
            }
        }

        scanner.close(); // Закрываем Scanner
    }
}
