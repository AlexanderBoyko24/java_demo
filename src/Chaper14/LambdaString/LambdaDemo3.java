package Chaper14.LambdaString;

public class LambdaDemo3 {
    public static void main(String[] args) {

// Данное лямбда-выражение определяет, является ли
// одна строка частью другой

        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "This is a test";

        System.out.println("Tested string: " + str);

        if (isIn.test(str, "This"))
            System.out.println("'This' is founded");
        else
            System.out.println("'This' is not founded");

        if (isIn.test(str, "xyz"))
            System.out.println("'xyz' is founded");
        else
            System.out.println("'xyz' is not founded");

    }
}
