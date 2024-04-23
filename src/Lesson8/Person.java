package Lesson8;

import java.util.Scanner;

public class Person {

    public String name;
    private int age;
    protected String password;

    Person(String name, int age) {
        this.name = name;
        this.age = age < 18 ? 0 : age;
        Scanner in = new Scanner(System.in);
        System.out.println("Set your password ");
        password = in.nextLine();
    }

    public int getAge() {
        return age;
    }

    private String getName(String password) throws IllegalAccessException {
        if (password.equals(this.password))
            return name;
        else
            throw new IllegalAccessException();
    }

    public void requestpersonalInfo() {
        System.out.println("Enter password first: ");
        Scanner in = new Scanner(System.in);
        String passwordCandidate = in.nextLine();
        try{
            System.out.println(getName(passwordCandidate));
            System.out.println(getName(passwordCandidate));
            System.out.println(getName(passwordCandidate));
        } catch (IllegalAccessException e){
//logging security violation event
            System.out.println("the password is incorrect. No personal info will be provided ");
        }
    }

}
