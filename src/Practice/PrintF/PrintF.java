package Practice.PrintF;

public class PrintF {
    public static void main (String [] args){
        /*printf - method to control, format, display text to the console
        window
        two arguments= format string + (object/variable/value)
        % [flags][precision][width][conversion -character]
         */
        System.out.printf("this is a format string %d",123);
        System.out.printf("\n%d this is a format string",123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Alex";
        int myInt = 50;
        double myDouble = 1000;

        //[conversion character]
        System.out.printf("%b", myBoolean);
        System.out.printf("\n%c", myChar);
        System.out.printf("\n%s", myString);
        System.out.printf("\n%d", myInt);
        System.out.printf("\n%f", myDouble);

        //width
        //minimum number of characters to be written as output
        System.out.printf("\nHello %10s", myString);//дает пробелы
        System.out.printf("\nHello %-10s", myString);//дает пробелы после слова

        //precision
        //set number of digits of precision when outputting floating-point values
        System.out.printf("\nyou have this much money %.1f", myDouble);//цифра дает количество цифр после запятой

        //flags
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus(+) or minus(-) sign for a numeric value
        //0 : numeric values are zero-padded
        // , : coma grouping separator if numbers>100
        System.out.printf("\nyou have this much money %20f", myDouble);
        System.out.printf("\nyou have this much money %020f", myDouble);
        System.out.printf("\nyou have this much money %,f", myDouble);
    }
}
