package Exercise4;

public class BreakDemo {
    public static void main (String [] args){
        int num;
        num = 100;

        for (int i=0; i < num; i++ ) {
            if (i*i >= num) break;
            // прекратить цикл если i=i больше либо равно 100
            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен");
    }
}
