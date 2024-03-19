package Lesson6;

public class ArrayUtils {
    int[] array;

    ArrayUtils(int[] array) {
        this.array = array;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public void initArray() {
        for (int i = 0; i < array.length; i++)
            array[i] = i;
    }

    public int[] copyArray(int[] arrayToCopyin) {
        for (int i = 0; i < arrayToCopyin.length; i++) {
            if (i < array.length)
                arrayToCopyin[i] = array[i];
            else break;
        }
        System.out.println("Sorry, cannot copy");
        return arrayToCopyin;

    }
}

