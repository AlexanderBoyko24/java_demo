package HomeWork;
import java.util.Scanner;
public class Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");

            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double sum;
            sum = num1 + num2;
            System.out.println(" Sum is " + sum);

            double avg;
            avg = (num1+num2)/2;
            System.out.println(" Average is " + avg);

            if (num1 > num2)
                System.out.println( num1 + " > " + num2 );
            if(num1 < num2)
                System.out.println(num1 +  " < " +  num2);
            if (num1 == num2)
                System.out.println(num1 +  " = " +  num2);

            scanner.close(); // закрытие сканнера, чтобы избежать утечек ресурсов
        }
    }

