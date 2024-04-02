package Lesson9;

public class OuterClass {

    int nums[];

    OuterClass(int[] nums) {
        this.nums = nums;
    }

    void analyze() {
        InnerClass innerClassObj = new InnerClass();

        System.out.println("Minimun in " + innerClassObj.min());
        System.out.println("Maximum in " + innerClassObj.max());
        System.out.println("Average in " + innerClassObj.avg());
    }

    class InnerClass {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) m = nums[i];
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 1; i < nums.length; i++) {
                a += nums[i];
            }
            return a / nums.length;
        }
    }
}
