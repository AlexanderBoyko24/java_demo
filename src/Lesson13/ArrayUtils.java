package Lesson13;

import Lesson11.TwoDimensionShape;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {
    int[] array;
    ArrayUtils(int[] array) {
        this.array = array;
    }
    public  void  printArray() {
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void  printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static  void initArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i;
    }

    public static int[] copyArray(int[] array, int[] arrayToCopyIn) {
        for (int i = 0; i < arrayToCopyIn.length; i++) {
            if (i < array.length)
                arrayToCopyIn[i] = array[i];
            else break;
        }
        return arrayToCopyIn;
    }

    public static void printArray(TwoDimensionShape[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
            array[i].showDimensions();
        }
    }

    static int[] setValuesRandom(int[] array, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max - min + 1) + min;
        }
        return array;
    }

    static int[] setValuesMathRandom(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }

    static int[] orderArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = in.nextInt();
        int[] array = new int[Math.abs(size)];
        System.out.println("Enter range from:");
        int min = in.nextInt();
        System.out.println("Enter range to:");
        int max = in.nextInt();
//        if (max < min) {
//            int t = max;
//            max = min;
//            min = t;
//        }
        return setValuesMathRandom(array, min, max);
    }

    public static void main(String[] args) {
        int[] experiment = orderArray();
        printArray(experiment);
    }
}









