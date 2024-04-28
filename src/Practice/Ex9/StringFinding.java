package Practice.Ex9;

import java.util.Scanner;

public class StringFinding {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String inputString = scanner.nextLine();

            System.out.println("Введите слово для поиска:");
            String searchWord = scanner.next();

            int count = countOccurrences(inputString, searchWord);
            System.out.println("Количество вхождений слова \"" + searchWord + "\": " + count);

            scanner.close();
        }

        // Метод для подсчета количества вхождений слова в строку
        public static int countOccurrences(String inputString, String searchWord) {
            int count = 0;
            // Разделяем строку на слова, используя пробел в качестве разделителя
            String[] words = inputString.split(" ");

            // Перебираем каждое слово в массиве
            for (String word : words) {
                // Если текущее слово совпадает с искомым словом, увеличиваем счетчик
                if (word.equals(searchWord)) {
                    count++;
                }
            }
            return count;
        }
    }
