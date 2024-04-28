package Practice.Collections.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUnmodified {
    public static void main (String [] args){
         // делаем список неизменяемым

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");


        //тип переменной должен быть List<>, а не ArrayList<>
        // (данный метод возвращает объект именно такого типа, общего для всех видов списков).
        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune)));
        solarSystem.add("Плутон");//попробуем добавить новый элемент
    }
}
