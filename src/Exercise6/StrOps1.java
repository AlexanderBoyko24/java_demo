package Exercise6;

public class StrOps1 {
    public static void main(String[] args) {
        String str1 = "Java - Internet leader";
        String str2 = new String(str1);
        String str3 = "Java strings are effective.";
        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 is equal to str2");
        else
            System.out.println("str1 is not equal to str2");

        if (str1.equals(str3))
            System.out.println("str1 is equal to str3");
        else
            System.out.println("str1 is not equal to str3");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 and str3 are equal");
        else if (result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is more than str3");

        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);


    }
}

