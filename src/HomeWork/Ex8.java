package HomeWork;

public class Ex8 {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++ ){
            System.out.print(i + " ");
            if ((i%2) == 0) continue;
            System.out.println();
//    continue срабатывает, когда if истинно, и поэтому пестой sout пропускается и не печатается.
// если if ложно, то continue не срабатывает, и sout печатается.
// if будет истинно, если  i будет четным числом и делиться на 2 без остатка
        }
    }

}
