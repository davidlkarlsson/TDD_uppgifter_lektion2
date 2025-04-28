package com.demo.uppgifter.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobby", 2, "Male");
        Bird bird1 = new Bird("Stina", 2, "Female");

        List<IAnimal> animals = new ArrayList();

        animals.add(bird1);
        animals.add(dog1);

        for (IAnimal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
