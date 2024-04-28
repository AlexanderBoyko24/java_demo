package Practice.Collections.Iterator;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<String> set = new java.util.TreeSet<String>();

        // Здесь вы пытаетесь выполнить итерацию по пустому множеству.
        // Поэтому ничего не будет выведено на экран.
        for (String item : set) {
            System.out.println(item);
        }
    }
}
