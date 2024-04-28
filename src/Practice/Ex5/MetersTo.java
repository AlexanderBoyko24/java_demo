package Practice.Ex5;

import java.util.Scanner;

public class MetersTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество метров:");
        double meters = scanner.nextDouble();

        System.out.println("Выберите единицу измерения для конвертации:");
        System.out.println("1. Мили");
        System.out.println("2. Дюймы");
        System.out.println("3. Ярды");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Переводим метры в мили (1 метр = 0.000621371 мили)
                double miles = meters * 0.0006;
                System.out.println(meters + " метров = " + miles + " миль");
                break;
            case 2:
                // Переводим метры в дюймы (1 метр = 39.3701 дюйм)
                double inches = meters * 39.3701;
                System.out.println(meters + " метров = " + inches + " дюймов");
                break;
            case 3:
                // Переводим метры в ярды (1 метр = 1.09361 ярд)
                double yards = meters * 1.09361;
                System.out.println(meters + " метров = " + yards + " ярдов");
                break;
            default:
                System.out.println("Неправильный выбор. Пожалуйста, выберите от 1 до 3.");
                break;
        }

        scanner.close(); // Закрываем Scanner
    }
}



