package Exercise3;

public class LogicalOpTable {
    public static void main (String [] args){
        boolean p, q;
/*
if - else = ?1:0   ?- условие
if (value){
1 } else {0}

value ?1:0
 */
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print((p?1:0) + "\t" + (q?1:0) + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));

        p = true; q = false;
        System.out.print((p?1:0) + "\t" + ((q?1:0)) + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));

        p = false; q = true;
        System.out.print((p?1:0)+ "\t" + ((q?1:0)) + "\t");
        System.out.print(((p&q) ?1:0)+ "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));

        p = false; q = false;
        System.out.print((p?1:0)+ "\t" + (q?1:0) + "\t");
        System.out.print(((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t");
        System.out.println(((p^q)?1:0) + "\t" + ((!p)?1:0));
    }
}
