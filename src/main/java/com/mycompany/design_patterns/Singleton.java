/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns;

/**
 *
 * @author mudra
 */
public class Singleton {
    private static Singleton instance;
    private final String message = "Singleton Instance";

    private Singleton() {
    }

    /**
     * Returns the single instance of the Singleton class.
     * 
     * @return Singleton instance
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Returns the message associated with the Singleton instance.
     * 
     * @return Message string
     */
    public String getMessage() {
        return message;
    }
}