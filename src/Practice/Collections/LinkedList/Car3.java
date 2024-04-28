package Practice.Collections.LinkedList;

import java.util.LinkedList;

public class Car3 {public static void main(String[] args) {
    LinkedList<Car> cars = new LinkedList<>();
    Car ferrari = new Car("Ferrari 360 Spider");
    Car bugatti = new Car("Bugatti Veyron");
    Car lambo = new Car("Lamborghini Diablo");

    cars.add(ferrari);
    cars.add(bugatti);
    cars.add(lambo);
    System.out.println(cars.pollFirst());
    System.out.println(cars.pollLast());

    System.out.println("Что осталось в списке?");
    System.out.println(cars);
}
}
