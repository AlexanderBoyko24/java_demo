package Practice.Ex10.ThreeArrays;

import java.util.Arrays;

public class ThreeArraysCommon {

        public static void main(String[] args) {
            int[] one = {-20, 1, 2, 3, 8, 54, 4, 5};
            int[] two = {6, 7, 8, 9, 10, -20};

            // Определение размера третьего массива
            int commonCount = countCommonElements(one, two);
            int[] three = new int[commonCount];

            // Заполнение третьего массива общими элементами
            int index = 0;
            for (int num : one) {
                if (contains(two, num) && !contains(three, num)) {
                    three[index++] = num;
                }
            }

            // Вывод третьего массива на консоль
            System.out.println("Третий массив, содержащий элементы общие для двух массивов:");
            for (int num : three) {
                System.out.print(num + " ");
            }
        }

        // Метод для подсчета количества общих элементов в двух массивах
        public static int countCommonElements(int[] arr1, int[] arr2) {
            int count = 0;
            for (int num : arr1) {
                if (contains(arr2, num)) {
                    count++;
                }
            }
            return count;
        }

        // Метод для проверки, содержится ли элемент в массиве
        public static boolean contains(int[] array, int value) {
            for (int num : array) {
                if (num == value) {
                    return true;
                }
            }
            return false;
        }
    }
