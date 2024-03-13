package Exercise4;

public class Break5 {
    public static void main (String [] args){

        done:
        for (int i =0; i<10; i++){
            for (int j=0; j<10; j++){
                for (int k=0; k<10; k++){
                    System.out.println(k +  " ");
                    if (k==5) break done;
                }
                System.out.println("After cycle k"); //не выполнится
            }
            System.out.println("After cycle j"); //не выполнится
        }
        System.out.println("After cycle i");
    }
}
