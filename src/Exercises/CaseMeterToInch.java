package Exercises;

public class CaseMeterToInch {
    public static void main (String args []) {
        double meters, inches;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++){
            meters = inches / 39.37;
            System.out.println(inches + " дюймам соответствует " +
                    meters + " метров.");
            counter++;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}

