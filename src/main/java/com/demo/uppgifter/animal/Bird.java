package com.demo.uppgifter.animal;

public class Bird implements IAnimal{

    private String birdName;
    private int age;
    private String gender;

    public Bird(String birdName, int age, String gender) {
        this.birdName = birdName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Bird: " + birdName + ", " + age + " years old, " + gender;
    }
}
