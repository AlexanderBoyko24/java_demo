package Lesson5;

public class Vehicle {

//    access_modifier_class ClassName {
//        type instanceVariable1;
//        type instanceVariable2;
//        type instanceVariable3;
//        type instanceVariableN;
//
//        access_modofier returntype methodName1(){
//            method body
//        }
//        access_modofier returntype methodName2(type parameter){
//            method body
//        }
//        access_modofier returntype methodNameN(type parameterName1, type parameterName2){
//            method body
//        }
//    }

    int passengers;
    int fuelCap;
    int milesPerGallon;

    Vehicle() {
    }

    Vehicle(int  passengers, int fuelCap, int milesPerGallon){
        this.passengers = passengers;
       this. fuelCap = fuelCap;
        this.milesPerGallon = milesPerGallon;

    }
    void showRange() {
        System.out.println("Vehicle can take  " + passengers
                + " passengers to the distance of "
                + fuelCap * milesPerGallon + " miles");
    }

    int calculateRange() {
        int range;
        range = fuelCap*milesPerGallon;
        return   range;
    }
    void showRangeWithName(String vehicleName) {
        System.out.println(vehicleName + " can take  " + passengers
                + " passengers to the distance of "
                + fuelCap * milesPerGallon + " miles");
    }
    int allInOneAboutRange(String vehicleName){
        int range;
        range = fuelCap*milesPerGallon;
        System.out.println(vehicleName + " can take  " + passengers
                + " passengers to the distance of "
                + range + " miles");
        return   range;
    }
}