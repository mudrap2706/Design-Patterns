/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Test;

/**
 *
 * @author mudra
 */
import com.mycompany.design_patterns.CarFacade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // For assertions

public class CarFacadeTest {

    @Test
    public void testStartCar() {
        CarFacade carFacade = new CarFacade();
        assertDoesNotThrow(() -> carFacade.startCar(), "Car should start without errors");
    }

    @Test
    public void testStopCar() {
        CarFacade carFacade = new CarFacade();
        assertDoesNotThrow(() -> carFacade.stopCar(), "Car should stop without errors");
    }

    @Test
    public void testNullCheck() {
        CarFacade carFacade = new CarFacade();
        assertNotNull(carFacade, "CarFacade instance should not be null");
    }
}