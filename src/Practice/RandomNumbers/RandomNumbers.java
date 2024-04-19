package Practice.RandomNumbers;
import java.util.Random;
public class RandomNumbers {
    public static void main (String [] args){
        Random random = new Random();

        int x = random.nextInt(100);//рандом до 100
        double y = random.nextDouble(100.0); //рандом дабла
        boolean z = random.nextBoolean(); //рандом булина


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
