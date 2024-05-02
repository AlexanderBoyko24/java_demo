package Chaper14.LAmbdaFunctionalInterface;

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        // Данное лямбда-выражение определяет, является ли
// одно целое число делителем другого
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 is a divider of 10");
        System.out.println();

        // Данное лямбда-выражение определяет, является ли
// одно число типа Double делителем другогo
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if (isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a divider of 212.0");

        // Данное лямбда-выражение определяет, является ли
// одна строка частью другой
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic functional interface";

        System.out.println("Tested string: " + str);

        if (isIn.test(str, "face"))
            System.out.println("'face' is founded");
        else
            System.out.println("'Face' is not founded");
    }
}
