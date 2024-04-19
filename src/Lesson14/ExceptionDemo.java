package Lesson14;

public class ExceptionDemo {
//    try {
//        block of code with potential exceptions
//    }
//    catch(ExceptionType exceptionObj) {
//        block of code which will be executed if the exception of this type will occur
//    }
//    finally{
//        block of code which will be executed no matter what

    public static void main(String[] args) {
        int[] arr1 = {4,8,36,32,64,128,256,512};
        int[] arr2 = {2,0,4,4,0,8};

        for (int i=0; i <arr1.length; i++){
            try {
                System.out.println("arr1[" + i + "]/arr2 " + i + "] = " + arr1[i]/arr2[i]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("OUT OF BOUND EXCEPTION HAS OCCURRED");
            } catch (ArithmeticException exc){
                System.out.println("Arithmetic EXCEPTION HAS OCCURRED");
            }
        }


        System.out.println("After catch");

    }
}

