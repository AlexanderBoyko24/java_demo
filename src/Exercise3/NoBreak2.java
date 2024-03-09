package Exercise3;

public class NoBreak2 {
    public static void main (String [] args){
        int i;

        for(i = 0; i<=5; i++) {
            switch (i) {

                case 1:
               case 2:
                case 3:
                    System.out.println("I is equal to 1, 2 or 3");
                    break;
                case 4:
                    System.out.println("I is equal to four");
                    break;
            }

        }

    }

}
