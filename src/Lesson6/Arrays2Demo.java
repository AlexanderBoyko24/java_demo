package Lesson6;

public class Arrays2Demo {
    public static void main(String[] args) {
        int nums[] = {99, 56, 1006465, 4644, -4687, 65465, -45, 89, -458, 789};

        int min, max;

        min = max = nums[0];

        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
            System.out.println("min is: " + min);
            System.out.println("max is: " + max);
        }
    }

