package Practice.Ex10;
import java.util.Arrays;
public class ThreeArraysNoRepeats {

    public static void main(String[] args) {

        int[] one = new int[]{-20, 1, 2, 3, 8, 54, 4, 5};
        int[] two = {6, 7, 8, 9, 10, -20};
        int[] three = new int[one.length + two.length];

        System.arraycopy(one, 0, three, 0, one.length);
        System.arraycopy(two, 0, three, one.length, two.length);

        // Удаляем дубликаты
        three = removeDuplicates(three);

        // Выводим значения третьего массива без повторений на консоль
        System.out.println("Третий массив без повторений:");
        for (int num : three) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    // Нашли дубликат, сдвигаем оставшиеся элементы
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--; // Уменьшаем длину массива
                    j--; // Уменьшаем индекс j, чтобы не пропустить следующий элемент
                }
            }
        }
        // Обрезаем массив до актуальной длины
        return Arrays.copyOf(array, length);
    }
}
