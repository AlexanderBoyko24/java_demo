package HomeWork;

public class Ex6 {
    public static void main(String[] args) {

  /*  for(i = 0; i < 10; i++){
        int sum;
        sum = sum + i;
    }
    System.out.println("Сумма: " + sum);
}
исходный код.   не задан тип для i;
                sum не имеет начального значения;
                System.out.println("Сумма: " + sum) вне блока for;
*/
        int i;
        int sum;
        sum =0;
        for (i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println("Сумма: " + sum);
        }
    }
}