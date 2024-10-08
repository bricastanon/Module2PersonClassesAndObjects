package com.pluralsight;

public class Person {

    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayName() {
        System.out.print("Hi, my name is " + this.name);
        System.out.print(" I'm " + this.age + " years old ");
        System.out.println("and I'm a " + this.gender);
    }
}
