package Practice.Ex9;

public class ArrayOperationsEven {
    public static void main(String[] args) {
        int[] numbers = {-3, 85, -40, 37, 4, 2, 7, 250, 80};

        int countEven = 0;
        // Подсчитываем количество четных чисел в массиве
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
        }

        // Создаем новый массив для четных чисел
        int[] evenNumbers = new int[countEven];
        int index = 0;
        // Заполняем новый массив четными числами
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[index] = numbers[i];
                index++;
            }
        }

        // Выводим новый массив на экран
        System.out.println("Массив четных чисел:");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
