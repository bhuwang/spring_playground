/**
 * 
 */
package com.bhuwan.spring.di.autowire.xml;

/**
 * @author bhuwan
 *
 */
public class Bus {

    private Engine engine;

    // for auto detect, if you have default constructor you must have setter for DI
    public Bus() {
        System.out.println("Bus default constructor.....");
    }

    // if you don't have default constructor then DI happens thru parameterized constructor.
    public Bus(Engine engine) {
        System.out.println("Bus parameterized constructor...");
        this.engine = engine;
    }

    public void printData() {
        System.out.println("Engine model year: " + engine.getModelYear());
    }

}
