package Practice.Array;

import java.util.ArrayList;

public class ArrayList2D {
    public static void main (String [] args){

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("pasta");
        bakerylist.add("bread");
        bakerylist.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("pepper");
        produceList.add("zucchini");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("cola");
        drinkList.add("tea");
//        System.out.println(drinkList);
//        System.out.println(drinkList.get(0));

        groceryList.add(bakerylist);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));


    }
}
