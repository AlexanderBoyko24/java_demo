package Practice.LogicalOperators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
//&& - оба условия должны быть true

      /*  int temp = 25;

        if (temp > 30) {
            System.out.println("Hot outside");
        }
        else  if(temp >= 20 && temp<= 30){
            System.out.println("Warm");
        }
        else {
            System.out.println("Cold");
            System.out.println("--------------------");*/


      // || - или одно или другое должно быть true
            Scanner scanner = new Scanner(System.in);

            System.out.println("You are playing a game! Press q or Q to quit");
            String response = scanner.next();

            /*if (response.equals("q") || response.equals("Q")){
                System.out.println("You quit the game");
            }
            else {
                System.out.println("You are still in game.");*/

        // !(not) меняет булин на обратное значение
        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still in game.");
        }
        else {
            System.out.println("You quit the game.");
            }
        }
    }

