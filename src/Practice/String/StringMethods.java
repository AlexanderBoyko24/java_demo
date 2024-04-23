package Practice.String;

public class StringMethods {
    public static void main (String [] args){

        String name = "Alex     ";

        boolean result = name.equalsIgnoreCase("alex");
        int result1  = name.length();
        char result2 = name.charAt(0);
        int result3 = name.indexOf("l");
        boolean result4 = name.isEmpty();
        String result5 = name.toUpperCase();
        String result6 = name.toLowerCase();
        String result7 = name.trim();
        String result8 = name.replace('A', 'O');


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
