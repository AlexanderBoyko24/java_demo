package Lesson6;

public class BubbleSortingDemo {
    public static void main(String[] args) {

        int[] nums = {99, 56, 1006465, 4644, -4687, 65465, -45, 89, -458, 789};

        int a, b, t;

        int size;

        size = 10;

        System.out.println("Initial array: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
            System.out.println();

            for (a = 1; a < size; a++) {
                   for (b = size - 1; b >= a; b--) {
                      if (nums[b - 1] < nums[b]) {
                        t = nums[b - 1];
                        nums[b - 1] = nums[b];
                        nums[b] = t;
                    }

                }
            }

            System.out.println("Sorted array: ");
            for (int i = 0; i < size; i++)
                System.out.print(" " + nums[i]);
            System.out.println();

        System.out.println("Another print: ");

        for (int i : nums){
            System.out.print(" " + i);
        }


        }
        }
