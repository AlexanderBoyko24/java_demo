package Practice.Ex9;
import java.util.Scanner;
public class StringReplace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("Введите слово для поиска:");
        String searchWord = scanner.next();

        System.out.println("Введите слово для замены:");
        String replacementWord = scanner.next();

        String replacedString = replaceWord(inputString, searchWord, replacementWord);
        System.out.println("Полученная строка: " + replacedString);

        scanner.close();
    }

    // Метод для замены слова в строке
    public static String replaceWord(String inputString, String searchWord, String replacementWord) {
        // Используем метод replaceAll для замены всех вхождений слова
        return inputString.replaceAll("\\b" + searchWord + "\\b", replacementWord);
    }
}
