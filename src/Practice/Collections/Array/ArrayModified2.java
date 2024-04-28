package Practice.Collections.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayModified2 {
    public static void main (String [] args){


List<String> originalList = new ArrayList<>();
originalList.add("one");
originalList.add("two");

List<String> unmodifiableList = Collections.unmodifiableList(originalList);

System.out.println(unmodifiableList); // [one, two]

originalList.add("three");

System.out.println(unmodifiableList); // [one, two, three]
 }
}