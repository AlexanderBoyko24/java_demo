package Chapter13.TwoGen;

public class SimpleGen {
    public static void main (String [] args){
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Value: " + v);
        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
}
