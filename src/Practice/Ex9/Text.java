package Practice.Ex9;
import java.util.Scanner;
public class Text {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите текст:");
            String text = scanner.nextLine();

            String capitalizedText = capitalizeSentences(text);
            System.out.println("Текст с каждым предложением, начинающимся с большой буквы:");
            System.out.println(capitalizedText);

            int digitCount = countDigits(text);
            System.out.println("Количество цифр в тексте: " + digitCount);

            int punctuationCount = countPunctuation(text);
            System.out.println("Количество знаков препинания в тексте: " + punctuationCount);

            int sentenceCount = countSentences(text);
            System.out.println("Количество предложений в тексте: " + sentenceCount);

            scanner.close();
        }

        public static String capitalizeSentences(String text) {
            StringBuilder result = new StringBuilder();
            boolean capitalize = true;
            for (char c : text.toCharArray()) {
                if (capitalize && Character.isLetter(c)) {
                    result.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    result.append(c);
                }
                if (c == '.' || c == '?' || c == '!') {
                    capitalize = true;
                }
            }
            return result.toString();
        }

        public static int countDigits(String text) {
            int count = 0;
            for (char c : text.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        }

        public static int countPunctuation(String text) {
            int count = 0;
            for (char c : text.toCharArray()) {
                if (c == '.' || c == ',' || c == '?' || c == '!' || c == ':' || c == ';' || c == '-') {
                    count++;
                }
            }
            return count;
        }

        public static int countSentences(String text) {
            int count = 0;
            for (char c : text.toCharArray()) {
                if (c == '.' || c == '?' || c == '!') {
                    count++;
                }
            }
            return count;
        }
    }
