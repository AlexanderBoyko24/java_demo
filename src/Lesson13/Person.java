package Lesson13;

public class Person {
    String firstName;
    String lastName;
    int yearOfBirth;
    int monthOfBirth;
    int dayOfBirth;
    long identifier;
    byte height;
    double weight;
    boolean isMarried;
    boolean hasChildren;
    Gender gender;

    enum Gender{
        MALE,
        FEMALE
    }

    public Person(String firstName, String lastName,  Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.gender = gender;
    }

    static void showInfoAboutPerson(String firstName,
                                    String lastName,
                                    int yearOfBirth,
                                    int monthOfBirth,
                                    int dayOfBirth,
                                    long identifier,
                                    byte height) {
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", dayOfBirth=" + dayOfBirth +
                ", identifier=" + identifier +
                ", height=" + height +
                '}');

    }
    void showInfoAboutPerson(){
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", dayOfBirth=" + dayOfBirth +
                ", identifier=" + identifier +
                ", height=" + height +
                '}');
    }

    void sayHello(){
        switch (gender){
            case MALE -> System.out.println("HELLO MISTER!");
            case FEMALE -> System.out.println("HELLO MISS!");
        }
    }

    public static void main (String [] args){
        Person myP= new Person("Mary", "Jane", Gender.FEMALE);
    }
}
