package Practice.Ex10.ThreeArrays;

public class ThreeArraysMinMax {
    public static void main(String[] args) {
        int[] one = {-20, 1, 2, 3, 8, 54, 4, 5};
        int[] two = {6, 7, 8, 9, 10, -20};

        // Формирование третьего массива с минимальными и максимальными значениями
        int[] three = minMaxValues(one, two);

        // Вывод третьего массива на консоль
        System.out.println("Третий массив, содержащий только минимальное и максимальное значение каждого из массивов:");
        for (int num : three) {
            System.out.print(num + " ");
        }
    }

    public static int[] minMaxValues(int[] arr1, int[] arr2) {
        int[] result = new int[4];

        // Находим минимальное и максимальное значение в первом массиве
        int min1 = arr1[0];
        int max1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min1) {
                min1 = arr1[i];
            } else if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }

        // Находим минимальное и максимальное значение во втором массиве
        int min2 = arr2[0];
        int max2 = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min2) {
                min2 = arr2[i];
            } else if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }

        // Добавляем минимальные и максимальные значения в третий массив
        result[0] = min1;
        result[1] = max1;
        result[2] = min2;
        result[3] = max2;

        return result;
    }
}
