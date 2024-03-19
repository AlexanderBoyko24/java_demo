package Lesson6;

public class ArrayUtilsDemo {
    public static void main (String [] args){
  int nums[] = new int[6];
  int numsToCopyIn[] = new int[8];

        ArrayUtils myUtils = new ArrayUtils(nums);

        myUtils.initArray();;
        myUtils.printArray();
        myUtils.copyArray(numsToCopyIn);
        ArrayUtils muUtils1 = new ArrayUtils(numsToCopyIn);
        muUtils1.printArray();
    }
}
