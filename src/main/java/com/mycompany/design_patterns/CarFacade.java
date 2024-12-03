/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns;

/**
 *
 * @author mudra
 */
public class CarFacade {
    private final Engine engine = new Engine();
    private final AirConditioner airConditioner = new AirConditioner();
    private final MusicSystem musicSystem = new MusicSystem();

    /**
     * Starts the car by starting all subsystems.
     */
    public void startCar() {
        engine.start();
        airConditioner.turnOn();
        musicSystem.turnOn();
    }

    /**
     * Stops the car by stopping all subsystems.
     */
    public void stopCar() {
        musicSystem.turnOff();
        airConditioner.turnOff();
        engine.stop();
    }

    private static class Engine {
        void start() {
            System.out.println("Engine started.");
        }

        void stop() {
            System.out.println("Engine stopped.");
        }
    }

    private static class AirConditioner {
        void turnOn() {
            System.out.println("Air Conditioner turned on.");
        }

        void turnOff() {
            System.out.println("Air Conditioner turned off.");
        }
    }

    private static class MusicSystem {
        void turnOn() {
            System.out.println("Music System started.");
        }

        void turnOff() {
            System.out.println("Music System stopped.");
        }
    }
}