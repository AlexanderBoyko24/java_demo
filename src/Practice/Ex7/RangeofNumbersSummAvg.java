package Practice.Ex7;

import java.util.Scanner;

public class RangeofNumbersSummAvg {
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();

            // Проверка порядка чисел и, если нужно, их обмен
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int sum = 0; // переменная для хранения суммы
            int count = 0; // переменная для хранения количества чисел

            // Подсчет суммы и количества чисел в диапазоне
            for (int i = num1; i <= num2; i++) {
                sum += i; // увеличиваем сумму на текущее число
                count++; // увеличиваем счетчик чисел
            }

            double average = (double) sum / count; // вычисляем среднее арифметическое

            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее арифметическое: " + average);
        }
    }
