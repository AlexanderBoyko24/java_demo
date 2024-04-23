package Practice.Array;

public class D2Array {
    public static void main(String[] args) {

        String[][] cars = new String[3][3];
//        String [][] cars = {    //можно объявить и так
//                            {"Camaro", "BMW", "Lambo"},
//                                {"Shelby", "Mustang", "GT500"},
//                                {"Tesla", "range", "Toyota"}
//                };

        cars[0][0] = "Camaro";
        cars[0][1] = "BMW";
        cars[0][2] = "Lambo";
        cars[1][0] = "Shelby";
        cars[1][1] = "Mustang";
        cars[1][2] = "GT500";
        cars[2][0] = "Tesla";
        cars[2][1] = "Range";
        cars[2][2] = "Toyota";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
