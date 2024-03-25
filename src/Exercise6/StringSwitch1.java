package Exercise6;

public class StringSwitch1 {
    public static void main (String [] args){
        String command = "cancel";

        switch (command){
            case "connect":
                System.out.println("Connection");
                break;
            case "cancel":
                System.out.println("Cancel");
                break;
            case "disconnect":
                System.out.println("Disconnection");
                break;
            default:
                System.out.println("Wrong command");
                break;
        }
    }
}
