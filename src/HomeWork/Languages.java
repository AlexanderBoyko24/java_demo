package HomeWork;


import java.io.IOException;
import java.util.Scanner;


public class Languages {
    public static void main (String [] args) throws IOException {
        char  choice;

        System.out.println(" 1. RU");
        System.out.println(" 2. ENG");
        System.out.println(" 3. UA");
        System.out.println(" 4. FR");
        System.out.print("Выберите язык, нажав на соответствующую цифру: ");

        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Привет\n");
           break;
            case '2':
                System.out.println("Hello\n");
               break;
            case '3':
                System.out.println("Привiт\n");
                break;
            case '4':
                System.out.println("Bonjour\n");
                break;
              default:
                System.out.print("You have chosen the wrong number!");
        }
    }
}


// второй вариант

//        System.out.println("Enter any language of the folowing");
//        System.out.println("RU\nENG\nUA\nFR");
//Scanner input = new Scanner(System.in);
//String language = input.nextLine();
//
//        switch (language){
//            case "RU" -> System.out.println("Привет");
//            case "ENG" -> System.out.println("Hello");
//            case "UA" -> System.out.println("Привiт");
//            case "FR" -> System.out.println("Bonjour");
//default -> System.out.println("Unknown language");
//        }
//         }
//                }