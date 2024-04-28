package Practice.Ex9;

public class ArrayPositive {
    public static void main(String[] args) {
        int[] numbers = {-3, 85, -40, 37, 4, 2, 7, 250, 80};

        int countPositive = 0;
        // Подсчитываем количество положительных чисел в массиве
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >  0) {
                countPositive++;
            }
        }

        // Создаем новый массив для положительных чисел
        int[] positiveNumbers = new int[countPositive];
        int index = 0;
        // Заполняем новый массив положительными числами
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveNumbers[index] = numbers[i];
                index++;
            }
        }

        // Выводим новый массив на экран
        System.out.println("Массив положительных чисел:");
        for (int i = 0; i < positiveNumbers.length; i++) {
            System.out.print(positiveNumbers[i] + " ");
        }
    }
}


