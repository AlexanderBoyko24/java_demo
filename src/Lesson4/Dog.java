package Lesson4;

public class Dog {

    String colour;
    int age;
    String breed;
    boolean isFemale;
    String name;

    Dog(String name){
    this.name = name;
    }

    Dog(String colour, int age, String breed, boolean isFemale,String name){
        this.colour = colour;
        this.age = age;
        this.breed = breed;
        this.isFemale = isFemale;
        this.name = name;
     }

    public Dog() {
        name = "unknown";

    }


    public  void printDogInfo(){
        System.out.println("\ninfo about my dog: " + name + ": "
                +  "\nbreed " + breed
                +  "\nage " + age
                +  "\nisFemale " + isFemale
                + "\nname " + name
                + "\ncolour " + colour

        );

    }

    }

