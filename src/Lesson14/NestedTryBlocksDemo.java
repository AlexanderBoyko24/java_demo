package Lesson14;

public class NestedTryBlocksDemo {
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 36, 32, 64, 128, 256, 512};
        int[] arr2 = {2, 0, 6, 0};

        try {
            for (int i = 0; i < arr1.length; i++) {
                try {
                    System.out.println("arr1[" + i + "]/arr2 " + i + "] = " + arr1[i] / arr2[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Arithmetic EXCEPTION HAS OCCURRED");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("The element was not found");
            System.out.println("Fatal error! The program execution is stopped");
        }
    }
}

