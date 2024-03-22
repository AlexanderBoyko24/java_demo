package Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\s\\w{6}!", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to StepIt!");

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found");
        }


        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "aRun32"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "aRun%2"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "aRun32trat"));
        System.out.println(Pattern.matches("[789]\\d{9}", "7123456789"));
        System.out.println(Pattern.matches("[789]{2}\\d{9}", "79123456789"));
        System.out.println(Pattern.matches("[789]{2}\\d{9}", "79-123456789"));
        System.out.println(Pattern.matches("[789]{2}\\d{9}", "00123456789"));


        String EXAMPLE_TEXT = "this is an example of a text , please check if it got corrected . here !";

        String pattern1 = "(\\w)(\\s+)([\\.,\\?\\!])";

        String modifiedString = EXAMPLE_TEXT.replaceAll(pattern1, "$1$3");

        System.out.println(modifiedString);

        String EXAMPLE_TEXT_1 = "This is my small example of a string I am goingt to use";

        System.out.println("is this string not empty? " + EXAMPLE_TEXT_1.matches("\\w.+"));
        System.out.println("is this string not empty? " + (EXAMPLE_TEXT_1.length()>0));

        String[]  splitString = EXAMPLE_TEXT_1.split("\\s+");

        System.out.println("Number of substrings splitting: " + splitString.length);

        for (String substring : splitString) {
            System.out.println(substring);
        }
        System.out.println(EXAMPLE_TEXT_1.replaceAll("\\s+", "\t"));
    }
}
