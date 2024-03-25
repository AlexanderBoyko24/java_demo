package Exercise6;

public class StringArrays1 {
    public static void main(String[] args) {
        String strs[] = {"Эта", "строка", "является", "тестом"};

        System.out.println("Исходный массив"); //array - массив
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        strs[2] = "также является";
        strs[3] = "тестом";

        System.out.println("Измененный массив: ");
        for (String s : strs)
            System.out.print(s + " ");

    }
}
