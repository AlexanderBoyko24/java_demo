package Practice.Array;

public class Array2 {
    public static void main (String [] args){
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Tesla";
        cars[2] = "Ford";

        for (int i=0; i< cars.length; i++){ //печатаем весь массив
            System.out.println(cars[i]);
        }
    }
}
