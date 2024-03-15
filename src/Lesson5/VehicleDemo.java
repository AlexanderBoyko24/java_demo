package Lesson5;

public class VehicleDemo {
    public static void main (String [] args){

     Vehicle minivan = new Vehicle(7, 16, 21);
     Vehicle sportcar = new Vehicle(2,14, 12);

     int rangeMinivan;
     int rangeSportcar;


     String myVarNameDifferentFromOneInTheMethod = "Minivan";

     //minivan.showRange();
    rangeMinivan  = minivan.allInOneAboutRange("Minivan");
   //  sportcar.showRange();
    rangeSportcar = sportcar.allInOneAboutRange("Sportcar");

  //  rangeMinivan = minivan.calculateRange();
        System.out.println("calculated rangeMinivan value:" +
                 rangeMinivan );
        System.out.println("calculated rangeSportcar value:" +
                 rangeSportcar);
    }
}
