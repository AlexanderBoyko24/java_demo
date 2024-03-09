package Exercise3;

public class NoBreak {
    public static void main (String [] args){
        int i;

        for(i = 0; i<=5; i++) {
            switch (i) {
                case 0:
                    System.out.println("I less than one");
                case 1:
                    System.out.println("I less than two");
                case 2:
                    System.out.println("I less than three");
                case 3:
                    System.out.println("I less than four");
                case 4:
                    System.out.println("I less than five");
            }
            System.out.println();
        }

    }
}
