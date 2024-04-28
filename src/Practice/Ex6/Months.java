package Practice.Ex6;
import java.util.Scanner;
public class Months {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер месяца (от 1 до 12): ");
            int month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                                        "September", "October", "November", "December"};
                System.out.println(months[month - 1]);
            } else {
                System.out.println("Ошибка: Введено значение не в диапазоне от 1 до 12.");
            }
        }
    }
}
