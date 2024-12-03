/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Test;

/**
 *
 * @author mudra
 */
import com.mycompany.design_patterns.AnimalFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {
    @Test
    void testDogCreation() {
        AnimalFactory factory = new AnimalFactory();
        AnimalFactory.Animal dog = factory.getAnimal("DOG");
        assertNotNull(dog, "Dog instance should not be null.");
        assertEquals("Woof!", dog.speak(), "Dog should speak 'Woof!'");
    }

    @Test
    void testCatCreation() {
        AnimalFactory factory = new AnimalFactory();
        AnimalFactory.Animal cat = factory.getAnimal("CAT");
        assertNotNull(cat, "Cat instance should not be null.");
        assertEquals("Meow!", cat.speak(), "Cat should speak 'Meow!'");
    }

    @Test
    void testInvalidAnimalCreation() {
        AnimalFactory factory = new AnimalFactory();
        assertNull(factory.getAnimal("INVALID"), "Invalid animal should return null.");
    }
}
