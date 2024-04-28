package Practice.Ex9;

public class ArrayOperationOdd {
    public static void main(String[] args) {
        int[] numbers = {-3, 85, -40, 37, 4, 2, 7, 250, 80};

        int countOdd = 0;
        // Подсчитываем количество нечетных чисел в массиве
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                countOdd++;
            }
        }

        // Создаем новый массив для нечетных чисел
        int[] oddNumbers = new int[countOdd];
        int index = 0;
        // Заполняем новый массив нечетными числами
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers[index] = numbers[i];
                index++;
            }
        }

        // Выводим новый массив на экран
        System.out.println("Массив нечетных чисел:");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
