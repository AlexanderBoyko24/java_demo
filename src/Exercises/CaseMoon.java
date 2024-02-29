package Exercises;

public class CaseMoon {
    public static void main (String args []) {
        double earthweight;
        double moonweight;

        earthweight = 80;
        System.out.println("Переменная earthweight содержит " + earthweight);

        moonweight = earthweight * 0.17;
        System.out.print ("Переменная moonweight содержит earthweight * 0.17: ");
        System.out.println(moonweight);
    }
}
