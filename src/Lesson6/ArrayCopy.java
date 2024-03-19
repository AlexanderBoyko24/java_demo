package Lesson6;

public class ArrayCopy {
    public static void main (String [] args){
        int i;
        int[] initialArray = new int[10];
        int[] independentCopy = new int[10];

        for (i = 0; i < initialArray.length; i++) initialArray[i] = i;

        if (independentCopy.length >= initialArray.length)
            for (i = 0; i < independentCopy.length; i++)
                independentCopy[i] = initialArray[i];

//        nums2 = nums1;
        initialArray[0] = 1000000;

        for (i = 0; i < independentCopy.length; i++)
            System.out.print(independentCopy[i] + " ");


    }
}
