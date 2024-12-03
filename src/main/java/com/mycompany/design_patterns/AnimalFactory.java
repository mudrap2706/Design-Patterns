/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns;

/**
 *
 * @author mudra
 */
public class AnimalFactory {
    public interface Animal {
        String speak();
    }

    public static class Dog implements Animal {
        @Override
        public String speak() {
            return "Woof!";
        }
    }

    public static class Cat implements Animal {
        @Override
        public String speak() {
            return "Meow!";
        }
    }

    public static class Bird implements Animal {
        @Override
        public String speak() {
            return "Chirp!";
        }
    }

    /**
     * Returns an animal instance based on the given type.
     * 
     * @param type Animal type as string
     * @return Animal instance
     */
    public Animal getAnimal(String type) {
        switch (type.toUpperCase()) {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            case "BIRD":
                return new Bird();
            default:
                return null;
        }
    }
}
