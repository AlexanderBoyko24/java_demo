package Lesson16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();
        HashMap<Book, Patient> hospitalLibrary = new HashMap<>();
        HashMap<Integer, String> inputLibrary = new HashMap<>();


        Book a = new Book("smbd", "smbd", (short) 1000);
        Book b = new Book("Ivanho", "Scott", (short) 1987);
        Book c = new Book("Oliver Twist", "Dickens", (short) 1900);
        Book d = new Book("Holmes", "Doyle", (short) 1754);
        Book e = new Book("Bug", "Poe", (short) 1357);
        Book f = new Book("Luke", "lee", (short) 1856, Book.Genre.CLASSIC);

        List<Book> list = Arrays.asList(b, b, c, d, e);


        Patient newPatient0 = new Patient("James", 1, Severity.LOW);
        Patient newPatient1 = new Patient("John", 45, Severity.MEDIUM);
        Patient newPatient2 = new Patient("John", 44, Severity.MEDIUM);
        Patient newPatient3 = new Patient("John", 1, Severity.HIGH);
        Patient newPatient4 = new Patient("John", 45, Severity.HIGH);

        List<Patient> listOFPatient = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);

        for (int i = 0; i < list.size() && i < listOFPatient.size(); i++) {
            hospitalLibrary.put(list.get(i), listOFPatient.get(i));
        }
        for (Book i : hospitalLibrary.keySet()) {
            System.out.println("key: " + i + "\n\tvalues: " + hospitalLibrary.get(i));
        }

        capitalCities.put("England", "london");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.size());
//        capitalCities.clear();


        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " values: " + capitalCities.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter keys and values");
        boolean stop = false;

//        System.out.println("enter how many pairs you want to add");
//        Integer number = scanner.nextInt();

//     for(; number > 0; number--){
        while (!stop) {
            System.out.println("Enter key");
            Integer key = scanner.nextInt();
            System.out.println("Enter values");
            String value = scanner.nextLine();
            inputLibrary.put(key, value);
            for (int i = 0; i < value.length(); i++) {
                char inputChar = value.charAt(i);
                if (inputChar == '.') {
                    stop = true;
                    break;
                }
            }
            inputLibrary.put(key, value.replace(".", ""));
        }
        for (Integer i : inputLibrary.keySet()){
            System.out.println("key: " + i + " value: " + inputLibrary.get(i));
        }
    }
}

