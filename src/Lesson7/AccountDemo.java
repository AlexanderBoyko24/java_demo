package Lesson7;

import java.sql.SQLOutput;

public class AccountDemo {
    public static void main (String [] args){

        Account newAcc = new Account("324567899", "6587tg");

        System.out.println(newAcc.phoneNumber);
        System.out.println(newAcc.name);
    }
}
