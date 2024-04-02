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
        System.out.println("Enter password first");
        password = in.nextLine();
    }

    public void setAge(int age) {
        System.out.println("Enter password first");
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        if (password.equals(this.password)) {
            this.age = age;
        } else System.out.println("Wrong password! Age is not suitable");
    }

    public int getAge() {
        return age;
    }

}
