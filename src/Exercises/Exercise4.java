package Exercises;

public class Exercise4 {
    public static void main (String args []) {
        int var; // объявить целочисленную переменную
        double x; // объявить переменную с плавающей точкой

        var = 10;// присвоить переменной var значение 10
        x = 10.0;// присвоить переменной х значение 10.О
        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println();

        var = var / 4;
        x = x / 4;

        System.out.println("Значение переменой var после деления: " + var);
        System.out.println("Значение переменой x после деления: " + x);


    }
}
