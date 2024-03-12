package HomeWork;

public class InchesToMeters {
    public static void main (String [] args){
        double meters, inches;
        int counter;

        // каждый фут = 12 дюймам
        counter = 0;
        for (inches = 1; inches <= 144; inches++){
            meters = inches / 39.37;
            System.out.println(inches + " дюймам соответствует " +  meters + " метров.");
            counter++;

            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
