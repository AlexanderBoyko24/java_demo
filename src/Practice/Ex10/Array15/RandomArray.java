package Practice.Ex10.Array15;


import java.util.Arrays;


public class RandomArray {
    public static void main(String[] args) {

                int[] array = {2, 77, 51, 95, 58, 72, 60, 44, 74, 10, 82, 50, 8, 37, 40};

                // Сортировка первых 7 элементов по возрастанию
                for (int i = 0; i < 7; i++) {
                    for (int j = i + 1; j < 7; j++) {
                        if (array[i] > array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }

                // Сортировка оставшихся элементов по убыванию
                for (int i = 7; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] < array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }

                // Вывод отсортированного массива
                System.out.println("Отсортированный массив:");
                System.out.println(Arrays.toString(array));
            }
        }
