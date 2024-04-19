package Lesson13;

public class IConstImp implements IConst {
    public static void main(String[] args) {
        int[] nums = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }
        B ob = new MyClass();
        //A ob  = new MyClass(); method3 -не будет работать,
        // потому что у класса А нет method3
        ob.method1();
        ob.method2();
        ob.method3();

        D obj = new DImp();
        obj.getUserId();
        obj.getAdminId();
        System.out.println(obj.getAdminId() + " " +  obj.getUserId());

        System.out.println("Universal ID: " + D.getUniversalID());
    }
}
