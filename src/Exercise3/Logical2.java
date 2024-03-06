package Exercise3;

public class Logical2 {
    public static void main (String [] args){
        boolean p, q;
        p = true;
        q = false;
    /*    int x, y;

        x = 1;
        p = (boolean) x;

        y = 0;
        q = (boolean) y;*/
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q =true;
        if( p & q) System.out.println("1");
        if(p | q) System.out.println("1");
        if(p ^ q) System.out.println("0");
        if(!p) System.out.println("0");

        p = true; q =false;
        if( p & q) System.out.println(0);
        if(p | q) System.out.println(1);
        if(p ^ q) System.out.println(0);
        if(!p) System.out.println(0);


    }

}
