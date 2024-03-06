package Exercise3;

public class SwitchDemo {
    public static void main (String [] args){
        int i;

        for(i = 0; i<10; i++)
            switch (i) {
                case 0:
                    System.out.println("i is equal to zero");
                    break;
                case 1:
                    System.out.println("i is equal to one");
                    break;
                case 2:
                    System.out.println("i is equal to two");
                    break;
                case 3:
                    System.out.println("i is equal to three");
                    break;
                 case 4:
                    System.out.println("i is equal to four");
                     break;
                default:
                    System.out.println("i is equal or more than five");
            }
    }
}
