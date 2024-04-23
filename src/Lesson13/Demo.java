package Lesson13;

public class Demo {
    public static void main(String[] args) {
        MyInterfaceImplementation obj = new MyInterfaceImplementation();

        obj.myMethod1();
        obj.myMethod2();
        obj.myMethod4(5, 7);
        MyInterface.myMethod5(obj);

        int[] nums = {1, 2, 3};
        ArrayUtils objAr = new ArrayUtils(nums);

        objAr.printArray();

        ArrayUtils.printArray(nums);
    }
}
