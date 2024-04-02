package Exercise6;

public class Encode {
    public static void main (String [] args){
        String msg = "this is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение:  ");
        System.out.println(msg);

        for (int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
