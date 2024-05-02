package Practice.Ex10.Salary;
import java.util.Scanner;
public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя количество сотрудников
        System.out.print("Введите количество сотрудников: ");
        int n = scanner.nextInt();

        int[] salaries = new int[n];

        // Заполняем массив зарплат
        for (int i = 0; i < n; i++) {
            System.out.print("Введите зарплату сотрудника " + (i + 1) + ": ");
            salaries[i] = scanner.nextInt();
        }

        // Запрашиваем у пользователя тип сортировки (по возрастанию или убыванию)
        System.out.print("Выберите тип сортировки (1 - по возрастанию, 2 - по убыванию): ");
        int sortOrder = scanner.nextInt();

        // Сортируем массив зарплат сортировкой пузырьком
        if (sortOrder == 1) {
            bubbleSortAscending(salaries);
        } else if (sortOrder == 2) {
            bubbleSortDescending(salaries);
        } else {
            System.out.println("Неверный тип сортировки.");
            return;
        }

        // Выводим отсортированные зарплаты
        System.out.println("Отсортированные зарплаты:");
        for (int salary : salaries) {
            System.out.println(salary);
        }

        scanner.close();
    }

    // Сортировка пузырьком по возрастанию
    public static void bubbleSortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен значений
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Сортировка пузырьком по убыванию
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Обмен значений
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
