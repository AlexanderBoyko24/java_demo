package Exercises10.Throws;

// Использование ключевого слова throws
 class ThrowsDemo {
    public static char prompt(String str)
            throws java.io.IOException {

        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter a letter"); //в методе промт может быть сгенерировано исключение,
                                                 //поэтому его вызов следует поместить в блок try
        } catch (java.io.IOException exc) {
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали клавишу " + ch);
    }
}
