package Practice.Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Car4 {
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        Car[] carsArray = cars.toArray(new Car[3]);
        System.out.println(Arrays.toString(carsArray));
    }
}
