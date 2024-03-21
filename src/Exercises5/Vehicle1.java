package Exercises5;

public class Vehicle1 {

    int passengers;
    int fuelcap;
    int mpg;

    Vehicle1(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}




class VehConsDemo {
    public static void main(String[] args) {
        Vehicle1 minivan = new Vehicle1(7,16,21);
        Vehicle1 sportcar = new Vehicle1(2,14,12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("For carrying " + dist + " miles minivan needs " + gallons + " gallons");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("For carrying " + dist + " miles sportcar needs " + gallons + " gallons");


    }
}

//class TwoVehicles {
//    public static void main(String[] args) {
//
//        Vehicle1 minivan = new Vehicle1();
//        Vehicle1 sportcar = new Vehicle1();
//
//        int range1, range2;
//
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 12;
//
//        sportcar.passengers = 2;
//        sportcar.fuelcap = 14;
//        sportcar.mpg = 12;
//
//        range1 = minivan.fuelcap * minivan.mpg;
//        range2 = sportcar.fuelcap * sportcar.mpg;
//        System.out.println("Minivan can carry " + minivan.passengers + " passengers to distance " + range1 + " miles");
//        System.out.println("Sportcar can carry " + sportcar.passengers + " passengers to distance " + range2 + " miles");
//    }
//}

