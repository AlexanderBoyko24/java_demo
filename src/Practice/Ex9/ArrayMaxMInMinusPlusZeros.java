package Practice.Ex9;

public class ArrayMaxMInMinusPlusZeros {
    public static void main(String[] args) {

        int[] numbers = {-3, 85, -40, 37, 4, 2, 7, 250, 80};
        int min, max;

        min = max = numbers[0];

        for (int i = 1; i < 9; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println("min is: " + min);
        System.out.println("max is: " + max);

        int negativeCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("negative: " + negativeCount);

        int positiveCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            }
        }
        System.out.println("positive: " + positiveCount);

        int zerosCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zerosCount++;
            }
        }
        System.out.println("zerosCount: " + zerosCount);
    }
}

/*без дублирования кода, оптимизированная версия

public class ArrayMaxMinMinusPlusZeros {
    public static void main(String[] args) {
        int[] numbers = {-3, 85, -40, 37, 4, 2, 7, 250, 80};
        int min = numbers[0];
        int max = numbers[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zerosCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            // Поиск минимального элемента
            if (numbers[i] < min) {
                min = numbers[i];
            }
            // Поиск максимального элемента
            if (numbers[i] > max) {
                max = numbers[i];
            }
            // Подсчет отрицательных, положительных и нулевых элементов
            if (numbers[i] < 0) {
                negativeCount++;
            } else if (numbers[i] > 0) {
                positiveCount++;
            } else {
                zerosCount++;
            }
        }

        System.out.println("min is: " + min);
        System.out.println("max is: " + max);
        System.out.println("negative: " + negativeCount);
        System.out.println("positive: " + positiveCount);
        System.out.println("zerosCount: " + zerosCount);
    }
} */
