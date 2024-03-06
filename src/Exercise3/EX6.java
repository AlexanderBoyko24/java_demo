package Exercise3;

public class EX6 {
    public static void main (String [] args){
        int  i;

        int sum = 0;
        for (i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println("Summ: " + sum);
        }
      }
}

/*  код с ошибкой был такой:

public static void main (String [] args){
        int  i;

        for (i = 0; i < 10; i++) {
             int sum;
            sum = sum + i;
        }
        System.out.println("Summ: " + sum);

       }
}
 */