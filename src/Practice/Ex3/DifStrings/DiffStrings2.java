package Practice.Ex3.DifStrings;

public class DiffStrings2 {

    public static void main(String[] args) {
        String line1 = "\"Your time is limited,";
        String line2 = "\tdon’t waste it";
        String line3 = "\t\tliving someone else’s life\"";
        String author = "Steve Jobs.";

        System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n\t\t\t" + author);
    }
}

/*Этот код использует символы новой строки (\n) для разделения текста
на отдельные строки и символы табуляции (\t) для добавления отступов.
Затем метод println() используется для вывода каждой строки текста.
 */