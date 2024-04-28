package Practice.Ex9;

public class ArrayNegative {
    public static void main(String[] args) {
        int[] numbers = {-3, 85, -40, 37, 4, 2, 7, 250, 80};

        int countNegative = 0;
        // Подсчитываем количество отрицательных чисел в массиве
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <  0) {
                countNegative++;
            }
        }

        // Создаем новый массив для отрицательных чисел
        int[] negativeNumbers = new int[countNegative];
        int index = 0;
        // Заполняем новый массив нечетными числами
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeNumbers[index] = numbers[i];
                index++;
            }
        }

        // Выводим новый массив на экран
        System.out.println("Массив отрицательных чисел:");
        for (int i = 0; i < negativeNumbers.length; i++) {
            System.out.print(negativeNumbers[i] + " ");
        }
    }
}


