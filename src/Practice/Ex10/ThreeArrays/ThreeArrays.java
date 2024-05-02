package Practice.Ex10;


import java.util.Arrays;

public class ThreeArrays {
    public static void main(String[] args) {
        int[] one = new int []{-20, 1, 2, 3, 8, 54, 4, 5};
        int[] two = {6, 7, 8, 9, 10, -20};
        int [] three = new int[one.length + two.length];

        System.arraycopy(one, 0, three, 0, one.length);
        System.arraycopy(two, 0, three, one.length, two.length);


        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i] + " ");
        }
    }
}