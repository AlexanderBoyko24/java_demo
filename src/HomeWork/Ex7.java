package HomeWork;

public class Ex7 {
    public static void main (String [] args){
        int i, x, y;
        boolean running;
        running = true;
        x = 30;
        y = 40;

        for (i=0; i<10; i++ ) {
            while (running){
                if (x<y) break;
            }
            System.out.println("После while");
        }
        System.out.println("После for");
    }
}
