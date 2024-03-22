package Lesson7;

public class StudentDemo {
    public static void main (String [] args){

        Student one = new Student("Aliosha", 10);
       one.addgrade(0,6);
       one.addgrade(1,7);
       one.avgCalc();
        System.out.println(  one.avgCalc());
        System.out.println(  one.maxGrade());


    }
}
