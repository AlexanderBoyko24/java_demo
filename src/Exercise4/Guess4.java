package Exercise4;

public class Guess4 {
    public static void main (String [] args) throws java.io.IOException{
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задуманная буква из диапазона A-Z. ");
            System.out.println("Попытайтесь ее угадать");

            ch = (char) System.in.read(); //получаем символы с клавиатуры
            //отбросить остальные символы
           /* do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');  если ввести несколько букв без этого куска кода, программа будет работать с каждой отдельно*/
            if (ch ==answer) System.out.println("Правильно!");
            else {
                System.out.println("Извините, нужная буква находится...");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);
    }
}
