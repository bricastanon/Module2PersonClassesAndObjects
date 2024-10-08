package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Person is a class
        //Person1 is an object with attributes
        Person person1 = new Person("Brianna", 25, "Female");
        Person person2 = new Person("Vanta", 3, "boy dog");
        Person person3 = new Person("Mu", 2, "boy dog");
       // System.out.println("Hi, my name is " + person1.name);
       // System.out.println(person1.age);

        // could do this instead of System.out.println because of method in class
        person1.displayName();
        person2.displayName();
        person3.displayName();
       


    }
}