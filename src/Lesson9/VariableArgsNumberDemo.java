package Lesson9;

public class VariableArgsNumberDemo {

    static void varTest( double n, int... v) {
        System.out.println("Number of args: " + v.length);

        System.out.println("Contents: ");

        System.out.println(" arg " + 0 + ": " + n);
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
    }

    static void varTest(int... v) {
        System.out.println("Number of args: " + v.length);

        System.out.println("Contents: ");

        System.out.println(" arg " + 0 + ": " );
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
    }

    public static void main(String[] args) {
        varTest(10);
        varTest(10, 9, -2);
        varTest(10.0);
    }
}
