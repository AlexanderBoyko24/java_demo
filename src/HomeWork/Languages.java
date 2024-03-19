package HomeWork;


import java.io.IOException;


public class Languages {
    public static void main (String [] args) throws IOException {
        char  choice;


        System.out.println("Справка");
        System.out.println(" 1. RU");
        System.out.println(" 2. ENG");
        System.out.println(" 3. UA");
        System.out.println(" 4. FR");
        System.out.print("Выберите язык, нажав на соответствующую цифру: ");

        choice = (char) System.in.read();

        System.out.println("\n");

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
                System.out.print("Спасибо!");
        }
    }
}