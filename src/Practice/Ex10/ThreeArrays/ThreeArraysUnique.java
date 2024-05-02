package Practice.Ex10;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeArraysUnique {

    public static void main(String[] args) {
        int[] one = {-20, 1, 2, 3, 8, 54, 4, 5};
        int[] two = {6, 7, 8, 9, 10, -20};

        // Формирование третьего массива с уникальными элементами
        int[] three = uniqueElements(one, two);

        // Вывод третьего массива на консоль
        System.out.println("Третий массив, содержащий только уникальные элементы каждого из массивов:");
        for (int num : three) {
            System.out.print(num + " ");
        }
    }

    public static int[] uniqueElements(int[] arr1, int[] arr2) {
        // Создаем список для хранения уникальных элементов
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Добавляем уникальные элементы из первого массива
        for (int num : arr1) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Добавляем уникальные элементы из второго массива
        for (int num : arr2) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Преобразуем список обратно в массив
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }
}
