package Exercise6;

public class Array1Demo {
    public static void main (String [] args){
        int sample[] = new int[10]; //массив
        int i;

        for (i = 0; i < 10; i = i+1)
            sample[i] = i;

        for (i = 0; i < 10; i = i+1)

            System.out.println("Элемент [" + i + "]: " + sample[i]);
    }
}
