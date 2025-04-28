package com.demo.uppgifter.animal;

public class Dog implements IAnimal {

    private String dogName;
    private int age;
    private String gender;

    public Dog(String dogName, int age, String gender) {
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog: " + dogName + ", " + age + " years old, " + gender;
    }
}
