package Lesson7;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        String[] strings = {"cat", "dog", "bird"};

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] += 1;
//        }

        for (int num : nums) {
            num += 1;
        }

        for (int num : nums) {
            System.out.print(nums + " ");
        }

        for (int x: nums){
            sum += x;
            if (x == 5) break;
        }
//
//        for (String x: strings){
//            System.out.println("array elements " + x);
//        }
//
      System.out.println("sum is equal to " + sum);


    }
}
