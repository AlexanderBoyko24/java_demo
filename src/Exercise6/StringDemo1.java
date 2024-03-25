package Exercise6;

public class StringDemo1 {
    public static void main (String [] args){
        String str1 = new String(" В java строки - объекты");
        String str2 = "Их можно создавать по-разномму";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
