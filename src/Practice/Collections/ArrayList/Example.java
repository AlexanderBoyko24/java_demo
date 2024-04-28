package Practice.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main (String [] args){
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        list.add("Hello");
        System.out.println("Добавить в конец списка: " + list);

        list.add(5, "Amigo");
        System.out.println("добавляем  amigo согласно указанному индексу: " + list);

        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(list);
        System.out.println("Первое добавление: " + secondList);
        secondList.addAll(1, list);
        System.out.println("Второе добавление в середину: " + secondList);

        ArrayList<String> copyOfSecondList = (ArrayList<String>) secondList.clone();
        secondList.clear();
        System.out.println("Clone" +  copyOfSecondList);

        System.out.println("Check for contains: " + copyOfSecondList.contains("Hello"));
        System.out.println("Check for contains: " + copyOfSecondList.contains("Check"));
    }
}
