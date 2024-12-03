/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns;

/**
 *
 * @author mudra
 */
public class DesignPatterns {
    public static void main(String[] args) {
        // Singleton Pattern Test
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getMessage());

        // Facade Pattern Test
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
        carFacade.stopCar();

        // Factory Pattern Test
        AnimalFactory factory = new AnimalFactory();
        AnimalFactory.Animal dog = factory.getAnimal("DOG");
        System.out.println("Dog says: " + dog.speak());
        AnimalFactory.Animal cat = factory.getAnimal("CAT");
        System.out.println("Cat says: " + cat.speak());
        AnimalFactory.Animal bird = factory.getAnimal("BIRD");
        System.out.println("Bird says: " + bird.speak());
    }
}