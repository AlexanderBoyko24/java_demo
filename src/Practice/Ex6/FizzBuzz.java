package Practice.Ex6;

import java.util.Scanner;

    public class FizzBuzz {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число от 1 до 100: ");
            int number = scanner.nextInt();

            if (number >= 1 && number <= 100) {
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (number % 3 == 0) {
                    System.out.println("Fizz");
                } else if (number % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(number);
                }
            } else {
                System.out.println("Ошибка: Введено значение не в диапазоне от 1 до 100.");
            }

            scanner.close(); // Закрываем Scanner
        }
    }
